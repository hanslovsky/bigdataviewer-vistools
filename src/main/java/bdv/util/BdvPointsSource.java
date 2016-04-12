package bdv.util;

import java.util.List;

import bdv.viewer.SourceAndConverter;
import net.imglib2.RealLocalizable;
import net.imglib2.realtransform.AffineTransform3D;
import net.imglib2.type.numeric.ARGBType;
import net.imglib2.type.numeric.integer.UnsignedShortType;

public class BdvPointsSource extends BdvOverlaySource< PointsOverlay >
{
	protected BdvPointsSource(
			final BdvHandle bdv,
			final int numTimepoints,
			final PlaceHolderConverterSetup setup,
			final SourceAndConverter< UnsignedShortType > source,
			final PlaceHolderOverlayInfo info,
			final PointsOverlay overlay )
	{
		super( bdv, numTimepoints, setup, source, info, overlay );
	}

	public < T extends RealLocalizable > void setPoints( final List< T > points )
	{
		overlay.setPoints( points );
	}

	public void setSourceTransform( final AffineTransform3D t )
	{
		overlay.setSourceTransform( t );
	}

	public void setColor( final ARGBType color )
	{
		setup.setColor( color );
	}
}
