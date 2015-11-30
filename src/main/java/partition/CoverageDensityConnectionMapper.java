package partition;

import geometry.TCPoint;
import geometry.TCPolyline;
import geometry.TCRegion;
import org.apache.spark.api.java.function.Function;
import scala.Tuple3;

import java.util.List;
import java.util.Map;


public class CoverageDensityConnectionMapper implements Function<Tuple3<Integer,Integer,TCRegion>, Object> {
    @Override
    public Tuple3<Integer, Integer, List<Integer>> call(Tuple3<Integer, Integer, TCRegion> v1) throws Exception {

        TCRegion region = v1._3();
        Map<Integer, TCPoint> points = region.getPoints();
        Map<Integer, TCPolyline> polylines = region.getPolylines();

        for (Map.Entry<Integer, TCPoint> pointEntry : points.entrySet()) {
            for(Map.Entry<Integer, TCPolyline> polylineEntry : polylines.entrySet())
            {
                // to-do
            }
        }

        return null;
    }
}
