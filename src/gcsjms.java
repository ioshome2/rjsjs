public class gcsjms {
    public static void main(String[] args){
    Factory factoryA = new FactoryA();
    Product productA = factoryA.creatProduct();
    productA.info();

    Factory factoryB = new FactoryB();
    Product productB = factoryB.creatProduct();
    productB.info();

    }
}

    interface  Factory {
 Product creatProduct();
    }
    interface Product{
         void info();
    }
    class FactoryA implements Factory{
        @Override
        public Product creatProduct(){
            return  new ProductA();
        }
    }

    class FactoryB implements Factory{
        @Override
        public Product creatProduct(){
            return  new ProductB();
        }
    }
    class ProductA implements Product{
        @Override
        public  void info(){
            System.out.println("产品的信息：A");
        }
    }

    class ProductB implements Product{
        @Override
        public void info(){
            System.out.println("产品的信息：B");
        }
    }

