package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ReadURLFrom */
public enum ReadURLFrom implements WireEnum {
    URL_VSDK(1),
    URL_IMAGEX(2);
    
    public static final ProtoAdapter<ReadURLFrom> ADAPTER = new ProtoAdapter_ReadURLFrom();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.ReadURLFrom$ProtoAdapter_ReadURLFrom */
    static final class ProtoAdapter_ReadURLFrom extends EnumAdapter<ReadURLFrom> {
        static {
            Covode.recordClassIndex(23424);
        }

        ProtoAdapter_ReadURLFrom() {
            super(ReadURLFrom.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ReadURLFrom fromValue(int i) {
            return ReadURLFrom.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23423);
    }

    public static ReadURLFrom fromValue(int i) {
        if (i == 1) {
            return URL_VSDK;
        }
        if (i != 2) {
            return null;
        }
        return URL_IMAGEX;
    }

    private ReadURLFrom(int i) {
        this.value = i;
    }
}
