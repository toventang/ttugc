package com.p2082ss.android.ugc.aweme.story.feed.common.p4045b;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.ss.android.ugc.aweme.story.feed.common.b.d */
public class EnumC77199d extends Enum<EnumC77199d> {
    public static final EnumC77199d UPLOADING;
    public static final EnumC77199d UPLOAD_FAIL;
    public static final EnumC77199d UPLOAD_SUCCESS;

    /* renamed from: a */
    private static final /* synthetic */ EnumC77199d[] f173190a;

    /* renamed from: b */
    private final boolean f173191b;

    /* renamed from: c */
    private final int f173192c;

    /* renamed from: d */
    private final int f173193d;

    /* renamed from: e */
    private final boolean f173194e;

    /* renamed from: f */
    private final boolean f173195f;

    /* renamed from: g */
    private final int f173196g;

    public static EnumC77199d valueOf(String str) {
        return (EnumC77199d) Enum.valueOf(EnumC77199d.class, str);
    }

    public static EnumC77199d[] values() {
        return (EnumC77199d[]) f173190a.clone();
    }

    public final int getBackgroundColor() {
        return this.f173196g;
    }

    public final int getIconRes() {
        return this.f173192c;
    }

    public final boolean getShowIcon() {
        return this.f173191b;
    }

    public final boolean getShowRetry() {
        return this.f173194e;
    }

    public final boolean getShowXIcon() {
        return this.f173195f;
    }

    public final int getTextRes() {
        return this.f173193d;
    }

    static {
        Covode.recordClassIndex(90211);
        C77200a aVar = new C77200a("UPLOADING");
        UPLOADING = aVar;
        EnumC77199d dVar = new EnumC77199d("UPLOAD_FAIL", 1, true, R.raw.icon_exclamation_mark_circle_fill, R.string.g5f, true, true, R.attr.bm);
        UPLOAD_FAIL = dVar;
        EnumC77199d dVar2 = new EnumC77199d("UPLOAD_SUCCESS", 2, true, R.raw.icon_tick_cirlce_fill, R.string.g5k);
        UPLOAD_SUCCESS = dVar2;
        f173190a = new EnumC77199d[]{aVar, dVar, dVar2};
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.b.d$a */
    static final class C77200a extends EnumC77199d {
        static {
            Covode.recordClassIndex(90212);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77200a(String str) {
            super(str, 0, false, 0, R.string.g5l);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.feed.common.p4045b.EnumC77199d
        public final String getText(Context context, float f) {
            C89219l.m154721d(context, "");
            String string = context.getResources().getString(getTextRes());
            C89219l.m154716b(string, "");
            String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{Integer.valueOf((int) (f * 100.0f))}, 1));
            C89219l.m154716b(a, "");
            return a;
        }
    }

    public String getText(Context context, float f) {
        C89219l.m154721d(context, "");
        String string = context.getResources().getString(this.f173193d);
        C89219l.m154716b(string, "");
        return string;
    }

    /* synthetic */ EnumC77199d(String str, int i, boolean z, int i2, int i3) {
        this(str, i, z, i2, i3, false, false, R.attr.a4);
    }

    private EnumC77199d(String str, int i, boolean z, int i2, int i3, boolean z2, boolean z3, int i4) {
        this.f173191b = z;
        this.f173192c = i2;
        this.f173193d = i3;
        this.f173194e = z2;
        this.f173195f = z3;
        this.f173196g = i4;
    }
}
