package beandefinition;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ly
 * @create 2018-11-28 22:41
 * bean����ӿ� �ṩ����bean����Ϣ
 **/
public interface BeanDefinition {

    String SINGLETION = "singleton";

    String PROTOTYPE = "prototype";

    /**
     * ��ȡbean���ֽ������
     * @return
     */
    Class<?> getBeanClass();

    /**
     * ��ȡ����bean�Ĺ�����
     * @return
     */
    String getBeanFactory();

    /**
     * ��ȡ����bean��ʵ������
     * @return
     */
    String getCreateBeanMethod();

    String getStaticCreateBeanMethod();

    String getBeanInitMethodName();

    String getBeanDestoryMethodName();

    /**
     * ��ȡbean������
     * @return
     */
    String getScope();

    boolean isSingleton();

    boolean isPrototype();

    /**
     * У�鴫���bean�����Ƿ���ȷ
     * @return
     */
    default boolean validate(){

        if(getBeanClass() == null){
            //�ֽ����ļ�Ϊ�� ���Ҵ���bean�Ĺ���Ϊ�� ���Ϸ�
            if(StringUtils.isBlank(getBeanFactory()) && StringUtils.isBlank(getCreateBeanMethod())){
                return false;
            }
        }
        return true;
    }

}
