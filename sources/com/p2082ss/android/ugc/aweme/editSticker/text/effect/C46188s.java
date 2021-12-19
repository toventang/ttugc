package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.s */
public final class C46188s {

    /* renamed from: a */
    private final int f107591a = 50;

    /* renamed from: b */
    private final LruCache<String, LinearGradient> f107592b = new C46189a(50, 50);

    static {
        Covode.recordClassIndex(54747);
    }

    /* renamed from: a */
    private LinearGradient m89118a(String str) {
        C89219l.m154721d(str, "");
        return this.f107592b.get(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.s$a */
    public static final class C46189a extends LruCache<String, LinearGradient> {

        /* renamed from: a */
        final /* synthetic */ int f107593a;

        static {
            Covode.recordClassIndex(54748);
        }

        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final LinearGradient create(String str) {
            C89219l.m154721d(str, "");
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, LinearGradient linearGradient, LinearGradient linearGradient2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(linearGradient, "");
        }

        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final int sizeOf(String str, LinearGradient linearGradient) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(linearGradient, "");
            return 1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46189a(int i, int i2) {
            super(i2);
            this.f107593a = i;
        }
    }

    /* renamed from: a */
    private void m89119a(String str, LinearGradient linearGradient) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(linearGradient, "");
        this.f107592b.put(str, linearGradient);
    }

    /* renamed from: a */
    public final LinearGradient mo78424a(int i, int i2, int i3, int i4) {
        String sb = new StringBuilder().append(i).append('-').append(i2).append('-').append(0).append('-').append(0).append('-').append(i3).append('-').append(i4).toString();
        LinearGradient a = m89118a(sb);
        if (a == null) {
            a = new LinearGradient(0.0f, 0.0f, (float) i3, (float) i4, i, i2, Shader.TileMode.REPEAT);
        }
        m89119a(sb, a);
        return a;
    }
}
