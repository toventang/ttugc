package com.bytedance.ies.xelement.defaultimpl.player.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.p1364b.EnumC19005h;
import com.bytedance.ies.xelement.p1364b.EnumC19011l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.b */
public final /* synthetic */ class C19203b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f45364a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f45365b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f45366c;

    static {
        Covode.recordClassIndex(21967);
        int[] iArr = new int[EnumC19005h.values().length];
        f45364a = iArr;
        iArr[EnumC19005h.SINGLE.ordinal()] = 1;
        iArr[EnumC19005h.ORDER.ordinal()] = 2;
        iArr[EnumC19005h.LIST.ordinal()] = 3;
        int[] iArr2 = new int[EnumC19011l.values().length];
        f45365b = iArr2;
        iArr2[EnumC19011l.LIGHT.ordinal()] = 1;
        iArr2[EnumC19011l.SHORT.ordinal()] = 2;
        int[] iArr3 = new int[EnumC19170o.values().length];
        f45366c = iArr3;
        iArr3[EnumC19170o.PLAYBACK_STATE_START.ordinal()] = 1;
        iArr3[EnumC19170o.PLAYBACK_STATE_PLAYING.ordinal()] = 2;
        iArr3[EnumC19170o.PLAYBACK_STATE_PAUSED.ordinal()] = 3;
        iArr3[EnumC19170o.PLAYBACK_STATE_STOPPED.ordinal()] = 4;
        iArr3[EnumC19170o.PLAYBACK_STATE_ERROR.ordinal()] = 5;
    }
}
