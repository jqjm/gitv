package com.gala.video.app.player.pingback.common;

import com.gala.video.app.player.pingback.ClickPingback;

public class EpisodeClickPingback extends ClickPingback {
    private static final String[] TYPES = new String[]{"r", "block", "rt", "rseat", "rpage", "isprevue", "c1", "c2", "now_c1", "now_qpid", "now_c2", "now_ep"};

    public EpisodeClickPingback() {
        super(TYPES);
    }
}
