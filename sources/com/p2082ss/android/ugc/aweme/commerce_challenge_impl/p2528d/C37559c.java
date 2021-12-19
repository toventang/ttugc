package com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.C17174a;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2523b.C37539b;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2527c.C37552b;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2527c.C37553c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.d.c */
public final class C37559c {

    /* renamed from: a */
    public static ConcurrentHashMap<String, C37539b> f88761a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static boolean f88762b;

    /* renamed from: c */
    public static LinkedHashMap<String, Bitmap> f88763c = new LinkedHashMap<>(30, 0.75f, true);

    /* renamed from: d */
    public static final C37559c f88764d = new C37559c();

    /* renamed from: e */
    private static boolean f88765e;

    private C37559c() {
    }

    /* renamed from: a */
    public static final ConcurrentHashMap<String, C37539b> m75729a() {
        if (f88765e) {
            return f88761a;
        }
        f88765e = true;
        ConcurrentHashMap<String, C37539b> a = C37553c.m75720a();
        f88761a = a;
        return a;
    }

    static {
        Covode.recordClassIndex(44956);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.d.c$b */
    public static final class C37561b<T> implements AbstractC34583a {

        /* renamed from: a */
        final /* synthetic */ MentionTextView f88772a;

        /* renamed from: b */
        final /* synthetic */ TextExtraStruct f88773b;

        /* renamed from: c */
        final /* synthetic */ String f88774c;

        static {
            Covode.recordClassIndex(44958);
        }

        public C37561b(MentionTextView mentionTextView, TextExtraStruct textExtraStruct, String str) {
            this.f88772a = mentionTextView;
            this.f88773b = textExtraStruct;
            this.f88774c = str;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a
        /* renamed from: a */
        public final /* synthetic */ void mo61039a(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null && !bitmap.isRecycled()) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                bitmapDrawable.setBounds(0, 0, (int) this.f88772a.getTextSize(), (int) this.f88772a.getTextSize());
                final C17174a aVar = new C17174a(bitmapDrawable);
                this.f88772a.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d.C37559c.C37561b.RunnableC375621 */

                    /* renamed from: a */
                    final /* synthetic */ C37561b f88775a;

                    static {
                        Covode.recordClassIndex(44959);
                    }

                    {
                        this.f88775a = r1;
                    }

                    public final void run() {
                        this.f88775a.f88772a.mo124996a(this.f88775a.f88773b.getEnd() - 1, this.f88775a.f88773b.getEnd(), aVar);
                    }
                });
                C37559c.m75730a(this.f88774c, this.f88773b.getHashTagName());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.d.c$d */
    public static final class C37564d extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ int f88781a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f88782b;

        /* renamed from: c */
        final /* synthetic */ TextView f88783c;

        /* renamed from: d */
        final /* synthetic */ String f88784d;

        /* renamed from: e */
        final /* synthetic */ String f88785e;

        static {
            Covode.recordClassIndex(44961);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            if (bitmap != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                int i = this.f88781a;
                bitmapDrawable.setBounds(0, 0, i, i);
                C17174a aVar = new C17174a(bitmapDrawable);
                SpannableStringBuilder spannableStringBuilder = this.f88782b;
                spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, this.f88782b.length(), 33);
                this.f88783c.setText(this.f88782b);
                String str = this.f88784d;
                if (str != null && str.length() != 0) {
                    C37559c.m75730a(this.f88785e, this.f88784d);
                }
            }
        }

        public C37564d(int i, SpannableStringBuilder spannableStringBuilder, TextView textView, String str, String str2) {
            this.f88781a = i;
            this.f88782b = spannableStringBuilder;
            this.f88783c = textView;
            this.f88784d = str;
            this.f88785e = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.d.c$a */
    public static final class C37560a extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ int f88766a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f88767b;

        /* renamed from: c */
        final /* synthetic */ TextView f88768c;

        /* renamed from: d */
        final /* synthetic */ String f88769d;

        /* renamed from: e */
        final /* synthetic */ String f88770e;

        /* renamed from: f */
        final /* synthetic */ boolean f88771f;

        static {
            Covode.recordClassIndex(44957);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            String str;
            if (bitmap != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                int i = this.f88766a;
                bitmapDrawable.setBounds(0, 0, i, i);
                this.f88767b.element.setSpan(new C17174a(bitmapDrawable), this.f88767b.element.length() - 1, this.f88767b.element.length(), 33);
                this.f88768c.setText(this.f88767b.element);
                String str2 = this.f88769d;
                if (str2 != null && str2.length() != 0) {
                    String str3 = this.f88770e;
                    if (this.f88771f) {
                        String str4 = this.f88769d;
                        Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                        str = str4.substring(1);
                        C89219l.m154716b(str, "");
                    } else {
                        str = this.f88769d;
                    }
                    C37559c.m75730a(str3, str);
                }
            }
        }

        public C37560a(int i, C89233z.C89238e eVar, TextView textView, String str, String str2, boolean z) {
            this.f88766a = i;
            this.f88767b = eVar;
            this.f88768c = textView;
            this.f88769d = str;
            this.f88770e = str2;
            this.f88771f = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.d.c$c */
    public static final class C37563c extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ TextView f88777a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f88778b;

        /* renamed from: c */
        final /* synthetic */ TextExtraStruct f88779c;

        /* renamed from: d */
        final /* synthetic */ String f88780d;

        static {
            Covode.recordClassIndex(44960);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            if (bitmap != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                bitmapDrawable.setBounds(0, 0, (int) this.f88777a.getTextSize(), (int) this.f88777a.getTextSize());
                C17174a aVar = new C17174a(bitmapDrawable);
                C89233z.C89238e eVar = this.f88778b;
                T t = eVar.element;
                TextExtraStruct textExtraStruct = this.f88779c;
                C89219l.m154716b(textExtraStruct, "");
                int end = textExtraStruct.getEnd();
                TextExtraStruct textExtraStruct2 = this.f88779c;
                C89219l.m154716b(textExtraStruct2, "");
                int end2 = textExtraStruct2.getEnd() + 1;
                C89219l.m154721d(t, "");
                int length = t.length();
                if (end <= length && end2 <= length && end <= end2) {
                    t.setSpan(aVar, end, end2, 33);
                }
                eVar.element = t;
                this.f88777a.setText(this.f88778b.element);
                String str = this.f88780d;
                TextExtraStruct textExtraStruct3 = this.f88779c;
                C89219l.m154716b(textExtraStruct3, "");
                C37559c.m75730a(str, textExtraStruct3.getHashTagName());
            }
        }

        public C37563c(TextView textView, C89233z.C89238e eVar, TextExtraStruct textExtraStruct, String str) {
            this.f88777a = textView;
            this.f88778b = eVar;
            this.f88779c = textExtraStruct;
            this.f88780d = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.d.c$e */
    public static final class C37565e extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ String f88786a;

        /* renamed from: b */
        final /* synthetic */ int f88787b;

        static {
            Covode.recordClassIndex(44962);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            MethodCollector.m26663i(10842);
            if (bitmap == null) {
                MethodCollector.m26664o(10842);
                return;
            }
            LinkedHashMap<String, Bitmap> linkedHashMap = C37559c.f88763c;
            String str = this.f88786a;
            C89219l.m154716b(str, "");
            int i = this.f88787b;
            C89219l.m154721d(bitmap, "");
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(((float) i) / ((float) width), ((float) i) / ((float) height));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            C89219l.m154716b(createBitmap, "");
            linkedHashMap.put(str, createBitmap);
            MethodCollector.m26664o(10842);
        }

        public C37565e(String str, int i) {
            this.f88786a = str;
            this.f88787b = i;
        }
    }

    /* renamed from: a */
    public static void m75730a(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            C33744d dVar = new C33744d();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            C33744d a = dVar.mo59983a("tag_name", lowerCase);
            if (str == null) {
                str = "";
            }
            C39162r.m79460a("show_commercial_emoji", a.mo59983a("enter_from", str).f79943a);
        }
    }

    /* renamed from: a */
    public static boolean m75731a(Aweme aweme, TextExtraStruct textExtraStruct) {
        if (aweme == null || aweme.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > aweme.getDesc().length() || textExtraStruct.getStart() >= aweme.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final UrlModel m75728a(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        long currentTimeMillis;
        long currentTimeMillis2;
        Long l;
        Long l2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!C37552b.m75719a() && !z) {
            return null;
        }
        m75729a();
        if (f88761a.isEmpty()) {
            return null;
        }
        Iterator<String> it = f88761a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            C89219l.m154716b(next, "");
            if (z2) {
                str2 = "#".concat(String.valueOf(next));
            } else {
                str2 = next;
            }
            if (str != null) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                str3 = str.toLowerCase();
                C89219l.m154716b(str3, "");
            } else {
                str3 = null;
            }
            if (C89219l.m154714a((Object) str2, (Object) str3)) {
                C37539b bVar = f88761a.get(next);
                if (bVar == null || (l2 = bVar.f88708a) == null) {
                    currentTimeMillis = (System.currentTimeMillis() / 1000) + 1;
                } else {
                    currentTimeMillis = l2.longValue();
                }
                if (currentTimeMillis >= System.currentTimeMillis() / 1000) {
                    continue;
                } else {
                    C37539b bVar2 = f88761a.get(next);
                    if (bVar2 == null || (l = bVar2.f88709b) == null) {
                        currentTimeMillis2 = (System.currentTimeMillis() / 1000) - 1;
                    } else {
                        currentTimeMillis2 = l.longValue();
                    }
                    if (currentTimeMillis2 > System.currentTimeMillis() / 1000) {
                        C37539b bVar3 = f88761a.get(next);
                        if (bVar3 != null) {
                            return bVar3.f88710c;
                        }
                    }
                }
            }
        }
        return null;
    }
}
