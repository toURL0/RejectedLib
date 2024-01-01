package de.tourl.lib.units;

import java.util.HashMap;
import java.util.Map;

public class Unit {

    private final Map<Dimension, Integer> dimensions = new HashMap<>();

    public Unit multiplyUnit(Unit unit) {

        unit.dimensions.keySet().forEach((val) -> multiplyDimension(val, unit.dimensions.get(val)));

        return this;
    }

    public Unit multiplyDimension(Dimension dimension, int exponent) {

        dimensions.put(dimension, dimensions.getOrDefault(dimension, 0) + exponent);

        return this;
    }

    public Unit divideUnit(Unit unit) {

        unit.dimensions.keySet().forEach((val) -> divideDimension(val, unit.dimensions.get(val)));

        return this;
    }

    public Unit divideDimension(Dimension dimension, int exponent) {

        return multiplyDimension(dimension, -exponent);
    }

    public String getDimensionalStructure() {

        return dimensions.keySet().stream()
                .map((val) -> dimensions.get(val) == 0 ? "" : val.getSymbol() + (dimensions.get(val) == 1 ? "" : "^(" + dimensions.get(val) + ")"))
                .reduce(String::join).orElse("");
    }

    public boolean isIdentical(Unit unit) {

        for(Dimension dimension : dimensions.keySet()) {

            if(dimensions.get(dimension).equals(unit.dimensions.getOrDefault(dimension, 0))) return false;
        }

        return true;
    }
}
