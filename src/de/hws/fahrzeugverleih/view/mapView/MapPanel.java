package de.hws.fahrzeugverleih.view.mapView;

import java.io.File;
import java.util.List;

import javax.swing.event.MouseInputListener;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.cache.FileBasedLocalCache;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.PanKeyListener;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCursor;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;

import de.hws.fahrzeugverleih.data.Motorcar;


public class MapPanel extends JXMapViewer {

	public MapPanel() {
		TileFactoryInfo info = new OSMTileFactoryInfo("ZIP archive", "jar:file:./.jxmapviewer2/tile.openstreetmap.org.zip!");
//		TileFactoryInfo info = new OSMTileFactoryInfo();
		DefaultTileFactory tileFactory = new DefaultTileFactory(info);
		// Setup local file cache
		File cacheDir = new File(System.getProperty("user.home") + File.separator + ".jxmapviewer2");
		tileFactory.setLocalCache(new FileBasedLocalCache(cacheDir, false));
		// Setup JXMapViewer
		this.setTileFactory(tileFactory);
		// ermittelt die Geoposition der Schule
		GeoPosition pforzheim = new GeoPosition(48.88729799943408, 8.735699927131796);
		// Set the zoom factor
		this.setZoom(4);
		this.setAddressLocation(pforzheim);
		// Add interactions
		MouseInputListener mil = new PanMouseInputListener(this);
		this.addMouseListener(mil);
		this.addMouseMotionListener(mil);
		this.addMouseListener(new CenterMapListener(this));
		this.addMouseWheelListener(new ZoomMouseWheelListenerCursor(this));
		this.addKeyListener(new PanKeyListener(this));
	}
	
	public void updateCarPosition(List<Motorcar> cars) {
		
	}

}
