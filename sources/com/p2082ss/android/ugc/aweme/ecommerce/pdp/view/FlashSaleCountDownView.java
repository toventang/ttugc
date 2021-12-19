package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.C23142d;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.FlashSaleCountDownView */
public final class FlashSaleCountDownView extends TuxTextView {

    /* renamed from: a */
    public static final SimpleDateFormat f104959a = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);

    /* renamed from: b */
    public static final C44991a f104960b = new C44991a((byte) 0);

    public FlashSaleCountDownView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public FlashSaleCountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.FlashSaleCountDownView$a */
    public static final class C44991a {
        static {
            Covode.recordClassIndex(53411);
        }

        private C44991a() {
        }

        public /* synthetic */ C44991a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(53410);
    }

    /* renamed from: a */
    private static /* synthetic */ C44995a m87670a(FlashSaleCountDownView flashSaleCountDownView) {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return flashSaleCountDownView.m87671b(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
    }

    /* renamed from: b */
    private final C44995a m87671b(float f) {
        C44995a aVar = new C44995a();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        aVar.f104970d.set(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()), 0.0f, f, 0.0f);
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        float applyDimension = TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics());
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        aVar.f104969c.set(applyDimension, 0.0f, TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()), 0.0f);
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        aVar.f104971e = TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics());
        Resources system5 = Resources.getSystem();
        C89219l.m154709a((Object) system5, "");
        aVar.f104967a = TypedValue.applyDimension(1, 16.0f, system5.getDisplayMetrics());
        Resources system6 = Resources.getSystem();
        C89219l.m154709a((Object) system6, "");
        aVar.f104972f = TypedValue.applyDimension(1, 12.0f, system6.getDisplayMetrics());
        aVar.f104968b = C0643b.m2378c(getContext(), R.color.bx);
        return aVar;
    }

    /* renamed from: a */
    public final void mo76119a(long j, TuxTextView tuxTextView) {
        if (j <= 0) {
            setText("");
        } else if (j >= 86400000) {
            String valueOf = String.valueOf((int) ((((((float) j) / 1000.0f) / 60.0f) / 60.0f) / 24.0f));
            setTuxFont(71);
            Context context = getContext();
            C89219l.m154716b(context, "");
            SpannableString spannableString = new SpannableString(context.getResources().getQuantityString(R.plurals.bg, Integer.parseInt(valueOf), valueOf.toString()));
            int a = C89361p.m154888a((CharSequence) spannableString, valueOf, 0, false, 6);
            if (a != -1) {
                spannableString.setSpan(new C23126b(72, true), a, valueOf.length() + a, 33);
            }
            setText(spannableString);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        } else {
            setTuxFont(92);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
            String format = f104959a.format(new Date(j));
            C89219l.m154716b(format, "");
            List c = C89361p.m154921c(format, new String[]{":"});
            String str = (String) c.get(0);
            String str2 = (String) c.get(1);
            String str3 = (String) c.get(2);
            C23142d dVar = new C23142d(":");
            dVar.mo37628a(62);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            if (C23163i.m43663a(context2)) {
                C45573n.m88117a(spannableStringBuilder, str3, m87670a(this));
                spannableStringBuilder.append((CharSequence) dVar);
                C45573n.m88117a(spannableStringBuilder, str2, m87670a(this));
                spannableStringBuilder.append((CharSequence) dVar);
                C45573n.m88117a(spannableStringBuilder, str, m87670a(this));
            } else {
                C45573n.m88117a(spannableStringBuilder, str, m87670a(this));
                spannableStringBuilder.append((CharSequence) dVar);
                C45573n.m88117a(spannableStringBuilder, str2, m87670a(this));
                spannableStringBuilder.append((CharSequence) dVar);
                C45573n.m88117a(spannableStringBuilder, str3, m87671b(0.0f));
            }
            setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ FlashSaleCountDownView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FlashSaleCountDownView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        if (isInEditMode()) {
            mo76119a(86339999, null);
        }
        f104959a.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
}
