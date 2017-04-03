package com.tom.command.case2;

import java.util.Iterator;
import java.util.List;

public class TestCommand {

	public static void main(String[] args) {
		List<Command> queue = Producer.produceRequests();
		for (Iterator<Command> it = queue.iterator(); it.hasNext();) {
			((Command) it.next()).execute();
		}
	}
}