package com.tom.bridge.message;
public class Client {

    public static void main(String[] args) {
        //���������ʵ�ֶ���
        MessageImplementor impl = new MessageSMS();
        //������ͨ��Ϣ����
        AbstractMessage message = new  CommonMessage(impl);
        message.sendMessage("�Ӱ���������","����");
        
        //��ʵ�ַ�ʽ�л����ʼ����ٴη���
        impl = new MessageEmail();
        //�����Ӽ���Ϣ����
        message = new UrgencyMessage(impl);
        message.sendMessage("�Ӱ���������","����");
    }

}