package de.tourl.lib.units;

import lombok.Getter;

@Getter
public enum Dimension {

    NONE("", ""),
    TIME("T", "s"),
    LENGTH("L", "m"),
    MASS("M", "kg"),
    ELECTRIC_CURRENT("I", "A"),
    THERMODYNAMIC_TEMPERATURE("[theta]", "K"),
    AMOUNT_OF_SUBSTANCE("N", "mol"),
    LUMINOUS_INTENSITY("J", "cd");

    private final String symbol;
    private final Unit unit;

    Dimension(String symbol, String unit) {

        this.symbol = symbol;
        this.unit = UnitManager.INSTANCE.resolve(unit);
    }

}
