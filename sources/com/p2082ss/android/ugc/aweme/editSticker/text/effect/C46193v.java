package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.v */
public final class C46193v {

    /* renamed from: a */
    private final int f107601a = 50;

    /* renamed from: b */
    private final LruCache<String, StaticLayout> f107602b = new C46194a(50, 50);

    static {
        Covode.recordClassIndex(54752);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.v$a */
    public static final class C46194a extends LruCache<String, StaticLayout> {

        /* renamed from: a */
        final /* synthetic */ int f107603a;

        static {
            Covode.recordClassIndex(54753);
        }

        @Override // android.util.LruCache
        public final StaticLayout create(String str) {
            C89219l.m154721d(str, "");
            return null;
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, StaticLayout staticLayout, StaticLayout staticLayout2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(staticLayout, "");
        }

        @Override // android.util.LruCache
        public final int sizeOf(String str, StaticLayout staticLayout) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(staticLayout, "");
            return 1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46194a(int i, int i2) {
            super(i2);
            this.f107603a = i;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private StaticLayout m89126a(CharSequence charSequence, TextPaint textPaint, int i, int i2, Layout.Alignment alignment, float f, float f2, int i3) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(textPaint, "");
        C89219l.m154721d(alignment, "");
        String sb = new StringBuilder().append(charSequence).append('-').append(0).append('-').append(i2).append('-').append(textPaint).append('-').append(i).append('-').append(alignment).append('-').append(f).append('-').append(f2).append('-').append(true).append('-').append(i3).append('-').append((Object) null).toString();
        C89219l.m154721d(sb, "");
        StaticLayout staticLayout = this.f107602b.get(sb);
        if (staticLayout == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(true).setEllipsizedWidth(i3).setEllipsize(null).build();
            } else {
                staticLayout = new StaticLayout(charSequence, 0, i2, textPaint, i, alignment, f, f2, true, null, i3);
            }
            C89219l.m154716b(staticLayout, "");
        }
        C89219l.m154721d(sb, "");
        C89219l.m154721d(staticLayout, "");
        this.f107602b.put(sb, staticLayout);
        return staticLayout;
    }
}
