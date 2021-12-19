package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum StoryKitExitEvent implements WireEnum {
    STORY_KIT_EXIT_EVENT_PLAYER_NONE(0),
    STORY_KIT_EXIT_EVENT_TAP_LEFT(1),
    STORY_KIT_EXIT_EVENT_TAP_RIGHT(2),
    STORY_KIT_EXIT_EVENT_AUTO_ADVANCE(3),
    STORY_KIT_EXIT_EVENT_PLAYER_CLOSE(4),
    STORY_KIT_EXIT_EVENT_EXTERNAL_APP_EVENT(5);
    
    public static final ProtoAdapter<StoryKitExitEvent> ADAPTER = new ProtoAdapter_StoryKitExitEvent();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_StoryKitExitEvent extends EnumAdapter<StoryKitExitEvent> {
        static {
            Covode.recordClassIndex(35324);
        }

        ProtoAdapter_StoryKitExitEvent() {
            super(StoryKitExitEvent.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final StoryKitExitEvent fromValue(int i) {
            return StoryKitExitEvent.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(35323);
    }

    public static StoryKitExitEvent fromValue(int i) {
        if (i == 0) {
            return STORY_KIT_EXIT_EVENT_PLAYER_NONE;
        }
        if (i == 1) {
            return STORY_KIT_EXIT_EVENT_TAP_LEFT;
        }
        if (i == 2) {
            return STORY_KIT_EXIT_EVENT_TAP_RIGHT;
        }
        if (i == 3) {
            return STORY_KIT_EXIT_EVENT_AUTO_ADVANCE;
        }
        if (i == 4) {
            return STORY_KIT_EXIT_EVENT_PLAYER_CLOSE;
        }
        if (i != 5) {
            return null;
        }
        return STORY_KIT_EXIT_EVENT_EXTERNAL_APP_EVENT;
    }

    private StoryKitExitEvent(int i) {
        this.value = i;
    }
}
