package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum StoryKitPlayerType implements WireEnum {
    STORY_KIT_PLAYER_TYPE_NONE(0),
    STORY_KIT_PLAYER_TYPE_EMBEDDED(1),
    STORY_KIT_PLAYER_TYPE_FULLSCREEN(2);
    
    public static final ProtoAdapter<StoryKitPlayerType> ADAPTER = new ProtoAdapter_StoryKitPlayerType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_StoryKitPlayerType extends EnumAdapter<StoryKitPlayerType> {
        static {
            Covode.recordClassIndex(35328);
        }

        ProtoAdapter_StoryKitPlayerType() {
            super(StoryKitPlayerType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final StoryKitPlayerType fromValue(int i) {
            return StoryKitPlayerType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(35327);
    }

    public static StoryKitPlayerType fromValue(int i) {
        if (i == 0) {
            return STORY_KIT_PLAYER_TYPE_NONE;
        }
        if (i == 1) {
            return STORY_KIT_PLAYER_TYPE_EMBEDDED;
        }
        if (i != 2) {
            return null;
        }
        return STORY_KIT_PLAYER_TYPE_FULLSCREEN;
    }

    private StoryKitPlayerType(int i) {
        this.value = i;
    }
}
