package hu.supercluster.gameoflife.game.transformer;

import hu.supercluster.gameoflife.game.testutils.GrowableCell;

public class SimpleGridTransformerTest extends AbstractGridTransformerTester {
    @Override
    protected GridTransformer<GrowableCell> getTransformer() {
        return new SimpleGridTransformer<>();
    }
}
