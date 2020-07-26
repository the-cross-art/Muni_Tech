package com.Munitech;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.LinearLayout;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import android.widget.EditText;
import android.widget.Button;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationListener;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import java.text.DecimalFormat;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class MapActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private MapView mapview1;
	private GoogleMapController _mapview1_controller;
	private EditText edittext3;
	private EditText edittext4;
	private Button button1;
	
	private LocationManager locn;
	private LocationListener _locn_location_listener;
	private AlertDialog.Builder dialogbox;
	private Vibrator vib;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.map);
		initialize(_savedInstanceState);
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, 1000);
		}
		else {
			initializeLogic();
		}
	}
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		mapview1 = (MapView) findViewById(R.id.mapview1);
		mapview1.onCreate(_savedInstanceState);
		
		edittext3 = (EditText) findViewById(R.id.edittext3);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		button1 = (Button) findViewById(R.id.button1);
		locn = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		dialogbox = new AlertDialog.Builder(this);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		_mapview1_controller = new GoogleMapController(mapview1, new OnMapReadyCallback() {
			@Override
			public void onMapReady(GoogleMap _googleMap) {
				_mapview1_controller.setGoogleMap(_googleMap);
				
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				vib.vibrate((long)(50));
				_mapview1_controller.moveCamera(Double.parseDouble(edittext3.getText().toString()), Double.parseDouble(edittext4.getText().toString()));
				_mapview1_controller.zoomTo(14);
				_mapview1_controller.addMarker("m", Double.parseDouble(edittext3.getText().toString()), Double.parseDouble(edittext4.getText().toString()));
				_mapview1_controller.setMarkerInfo("m", "my position", String.valueOf(Double.parseDouble(edittext3.getText().toString())).concat(",".concat(String.valueOf(Double.parseDouble(edittext4.getText().toString())))));
				_mapview1_controller.setMarkerIcon("m", R.drawable.ic_location_on_black);
			}
		});
		
		_locn_location_listener = new LocationListener() {
			@Override
			public void onLocationChanged(Location _param1) {
				final double _lat = _param1.getLatitude();
				final double _lng = _param1.getLongitude();
				final double _acc = _param1.getAccuracy();
				edittext3.setText(String.valueOf(_lat));
				edittext4.setText(String.valueOf(_lng));
				if (String.valueOf(Double.parseDouble(edittext3.getText().toString())).equals(String.valueOf(_lat)) || String.valueOf(Double.parseDouble(edittext4.getText().toString())).equals(String.valueOf(_lng))) {
					_mapview1_controller.moveCamera(_lat, _lng);
					_mapview1_controller.zoomTo(14);
					_mapview1_controller.addMarker("m", _lat, _lng);
					_mapview1_controller.setMarkerInfo("m", "my position", String.valueOf(_lat).concat(",".concat(String.valueOf(_lng))));
					_mapview1_controller.setMarkerIcon("m", R.drawable.ic_location_on_black);
				}
			}
			@Override
			public void onStatusChanged(String provider, int status, Bundle extras) {}
			@Override
			public void onProviderEnabled(String provider) {}
			@Override
			public void onProviderDisabled(String provider) {}
		};
	}
	private void initializeLogic() {
		if (ContextCompat.checkSelfPermission(MapActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
			locn.requestLocationUpdates(LocationManager.GPS_PROVIDER, 3, 1, _locn_location_listener);
		}
		dialogbox.setTitle("GPS REQUIRED");
		dialogbox.setMessage("\"view in map\" requires to access your location, kindly enable GPS and click anywhere on the screen to continue.");
		dialogbox.setPositiveButton("DONE", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dialogbox.create().show();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		mapview1.onDestroy();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		mapview1.onStart();
	}
	
	@Override
	public void onPause() {
		super.onPause();
		mapview1.onPause();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		mapview1.onResume();
	}
	
	@Override
	public void onStop() {
		super.onStop();
		mapview1.onStop();
	}
	private void _search () {
		
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
