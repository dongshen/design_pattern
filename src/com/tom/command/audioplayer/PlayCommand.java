package com.tom.command.audioplayer;

public class PlayCommand implements Command {

	private AudioPlayer myAudio;

	public PlayCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	/**
	 * ִ�з���
	 */
	@Override
	public void execute() {
		myAudio.play();
	}

}
