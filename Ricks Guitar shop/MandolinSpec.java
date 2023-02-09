public class MandolinSpec {

    public Builder builder;
    public String model;
    public Type type;
    public Wood topWood;
    public Wood backWood;
    public NumStrings numStrings;
    public Style style;

    MandolinSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood,
            Style style) {
        this.builder = builder;
        this.topWood = topWood;
        this.type = type;
        this.model = model;
        this.backWood = backWood;
        this.style = style;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        if (this.model == "")
            return null;
        return model;
    }

    public Type getType() {
        return type;
    }

    public Style getStyle() {
        return style;
    }

    public NumStrings getNumStrings() {
        return numStrings;
    }

    public boolean compare(MandolinSpec spec) {
        if (getModel() != null && spec.getModel() != null)
            if (getModel() != spec.getModel())
                return false;
        if (getBuilder() != null && spec.getBuilder() != null)
            if (getBuilder() != spec.getBuilder())
                return false;
        if (getBackWood() != null && spec.getBackWood() != null)
            if (getBackWood() != spec.getBackWood())
                return false;
        if (getTopWood() != null && spec.getTopWood() != null)
            if (getTopWood() != spec.getTopWood())
                return false;
        if (getType() != null && spec.getType() != null)
            if (getType() != spec.getType())
                return false;

        if (getNumStrings() != null && spec.getNumStrings() != null)
            if (getNumStrings() != spec.getNumStrings())
                return false;
        if (getStyle() != null && spec.getStyle() != null)
            if (getStyle() != spec.getStyle())
                return false;
        return true;

    }

}
