public class Cat {
    private String name;
    private String color;

    Cat (String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }

        if (obj instanceof Cat){
            Cat another = (Cat) obj;
            if (this.name.equals(another.name) && this.color.equals(another.color)){
                return true;
            }
        }
        return false;
    }
}
