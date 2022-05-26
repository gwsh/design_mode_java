/**
 * @author gwsh
 * @date 2022-05-26 20:42:34
 * @description 工厂模式 The factory pattern
 * 封装 继承 多态 其实很多时候都是一起应用的
 */
public class Code_01_FactoryPattern {

    /**
     * 创建工厂
     *
     * @param operateType 类型
     * @return
     */
    public static Operation createOperate(OperateType operateType) {
        Operation tmp = null;
        switch (operateType) {
            case ADD:
                tmp = new AddOperation();
                break;
            case DIVIDE:
                tmp = new DivideOperation();
                break;
            case MULTIPLY:
                tmp = new MultiplyOperation();
                break;
            case SUBTRACT:
                tmp = new SubtractOperation();
                break;
            default:
                break;
        }
        return tmp;
    }

    /**
     * test function
     *
     * @param args
     */
    public static void main(String[] args) {
        Operation operate = Code_01_FactoryPattern.createOperate(OperateType.ADD);
        System.out.println(operate.toString());;
    }
}


enum OperateType {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
}


/**
 * abstract base class
 */
class Operation {

}


class AddOperation extends Operation {
    @Override
    public String toString() {
        return "AddOperation";
    }
}

class SubtractOperation extends Operation {
    @Override
    public String toString() {
        return "SubtractOperation";
    }
}

class MultiplyOperation extends Operation {
    @Override
    public String toString() {
        return "MultiplyOperation";
    }
}

class DivideOperation extends Operation {
    @Override
    public String toString() {
        return "DivideOperation";
    }
}