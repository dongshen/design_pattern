package com.tom.command.case1;

public class Client {
	public static void main(String[] args) {
		// ����������
		Receiver receiver = new Receiver();
		// ����������󣬲��������Ľ�����
		Command command = new CreateCommand(receiver);

		// ���������ߣ�������������ý�ȥ
		Invoker invoker = new Invoker();
		invoker.setCommand(command);

		// ������Բ���һ��
		invoker.runCommand();
		invoker.unDoCommand();
	}
}