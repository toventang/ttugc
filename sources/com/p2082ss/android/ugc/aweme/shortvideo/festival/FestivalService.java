package com.p2082ss.android.ugc.aweme.shortvideo.festival;

import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p035f.C0671a;
import androidx.core.p037h.C0792v;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.port.p3561in.IFestivalService;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import java.text.Bidi;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.FestivalService */
public class FestivalService implements IFestivalService {
    static {
        Covode.recordClassIndex(84382);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IFestivalService
    /* renamed from: a */
    public final String mo101500a() {
        return C71849n.m126865a().mo113497c();
    }

    /* renamed from: b */
    public static IFestivalService m126857b() {
        Object a = C81908b.m141854a(IFestivalService.class, false);
        if (a != null) {
            return (IFestivalService) a;
        }
        return new FestivalService();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IFestivalService
    /* renamed from: a */
    public final void mo101501a(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView) {
        int i;
        int i2;
        String replaceAll;
        String charSequence;
        int i3;
        if (!TextUtils.isEmpty(str)) {
            int a = (int) (((float) C13628n.m24504a(textView.getContext())) - C13628n.m24520b(textView.getContext(), 32.0f));
            if (C80471gb.m139483a(textView.getContext())) {
                i = -1;
            } else {
                i = -2;
            }
            boolean baseIsLeftToRight = new Bidi(str, i).baseIsLeftToRight();
            boolean a2 = C80471gb.m139483a(viewGroup.getContext());
            C0792v.m2759b((View) textView.getParent(), !baseIsLeftToRight);
            int i4 = 3;
            if (baseIsLeftToRight != 0) {
                i2 = 3;
            } else {
                i2 = 5;
            }
            textView.setGravity(i2);
            int i5 = Build.VERSION.SDK_INT;
            if (baseIsLeftToRight == 0) {
                i4 = 2;
            }
            textView.setTextDirection(i4);
            viewGroup.setLayoutDirection(a2 ? 1 : 0);
            String b = C0671a.m2408a(!baseIsLeftToRight).mo2696b(str);
            if (baseIsLeftToRight != 0) {
                replaceAll = "‭" + b + (char) 8237;
            } else {
                replaceAll = b.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
            }
            SpannableString spannableString = new SpannableString(replaceAll);
            if (textView2 == null) {
                charSequence = "";
            } else {
                charSequence = textView2.getText().toString();
            }
            C71846k kVar = new C71846k(textView.getPaint(), a, charSequence);
            SpannableString a3 = kVar.mo62373a(spannableString);
            boolean z = kVar.f161009b;
            textView.setText(a3);
            int i6 = 8;
            if (z) {
                if (!TextUtils.isEmpty(replaceAll)) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                textView2.setVisibility(i3);
                if (!TextUtils.isEmpty(replaceAll)) {
                    i6 = 0;
                }
                imageView.setVisibility(i6);
                textView.post(new RunnableC71836b(textView, spannableString, imageView, textView2, viewGroup, a3));
                return;
            }
            imageView.setVisibility(8);
            textView2.setVisibility(8);
        }
    }
}
