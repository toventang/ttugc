package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextPaint;
import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.core.widget.C0823h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.hu */
public final class C80552hu {

    /* renamed from: a */
    public static final C80552hu f180162a = new C80552hu();

    /* renamed from: b */
    private static final AbstractC89244h f180163b = C89250i.m154773a((AbstractC89171a) C80553a.f180164a);

    /* renamed from: a */
    private static SparseIntArray m139634a() {
        return (SparseIntArray) f180163b.getValue();
    }

    private C80552hu() {
    }

    static {
        Covode.recordClassIndex(93825);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.hu$a */
    static final class C80553a extends AbstractC89220m implements AbstractC89171a<SparseIntArray> {

        /* renamed from: a */
        public static final C80553a f180164a = new C80553a();

        static {
            Covode.recordClassIndex(93826);
        }

        C80553a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SparseIntArray invoke() {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.put(10, R.style.xu);
            sparseIntArray.put(11, R.style.xw);
            sparseIntArray.put(12, R.style.xy);
            sparseIntArray.put(13, R.style.y0);
            sparseIntArray.put(14, R.style.y2);
            sparseIntArray.put(15, R.style.y4);
            sparseIntArray.put(16, R.style.y6);
            sparseIntArray.put(17, R.style.y7);
            return sparseIntArray;
        }
    }

    /* renamed from: a */
    public static void m139635a(TextView textView, int i, int i2, int i3) {
        C89219l.m154721d(textView, "");
        CharSequence text = textView.getText();
        TextPaint paint = textView.getPaint();
        Integer valueOf = Integer.valueOf(textView.getLayoutParams().width);
        if (valueOf.intValue() > 0 && valueOf != null) {
            i3 = valueOf.intValue();
        }
        int paddingRight = (i3 - textView.getPaddingRight()) - textView.getPaddingLeft();
        if (i2 >= i) {
            while (true) {
                C89219l.m154716b(paint, "");
                paint.setTextSize(C13628n.m24520b(textView.getContext(), (float) i2));
                if (paint.measureText(text.toString()) >= ((float) paddingRight)) {
                    if (i2 == i) {
                        break;
                    }
                    i2--;
                } else {
                    C0823h.m2907a(textView, m139634a().get(i2));
                    return;
                }
            }
        }
        C0823h.m2907a(textView, m139634a().get(i));
    }
}
