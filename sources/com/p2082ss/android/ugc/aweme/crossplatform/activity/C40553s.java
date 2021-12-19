package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.EnumC40623c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.s */
public final class C40553s {

    /* renamed from: a */
    View f94881a;

    /* renamed from: b */
    View f94882b;

    /* renamed from: c */
    View f94883c;

    /* renamed from: d */
    List<Integer> f94884d;

    /* renamed from: e */
    Activity f94885e;

    /* renamed from: f */
    AbstractC40547m f94886f;

    /* renamed from: g */
    private PopupWindow f94887g;

    /* renamed from: h */
    private View.OnClickListener f94888h = new View$OnClickListenerC40554t(this);

    static {
        Covode.recordClassIndex(48374);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PopupWindow mo69674a() {
        if (this.f94887g == null) {
            View a = C1764a.m5927a(LayoutInflater.from(this.f94885e), R.layout.v2, null, false);
            this.f94881a = a.findViewById(R.id.dh9);
            this.f94882b = a.findViewById(R.id.aeg);
            this.f94883c = a.findViewById(R.id.cwu);
            this.f94881a.setOnClickListener(this.f94888h);
            this.f94882b.setOnClickListener(this.f94888h);
            this.f94883c.setOnClickListener(this.f94888h);
            PopupWindow popupWindow = new PopupWindow(a, -2, -2, true);
            this.f94887g = popupWindow;
            popupWindow.setTouchable(true);
            this.f94887g.setAnimationStyle(R.style.w5);
            this.f94887g.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.f94887g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69675a(String str) {
        if (!C13627m.m24498a(str)) {
            EnumC40623c[] values = EnumC40623c.values();
            for (EnumC40623c cVar : values) {
                if (TextUtils.equals(str, cVar.key)) {
                    int i = cVar.f95081id;
                    if (i > 0) {
                        C13628n.m24510a(this.f94885e.findViewById(i), 8);
                        if (this.f94884d == null) {
                            this.f94884d = new ArrayList();
                        }
                        if (!this.f94884d.contains(Integer.valueOf(i))) {
                            this.f94884d.add(Integer.valueOf(i));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    C40553s(Activity activity, AbstractC40547m mVar) {
        this.f94885e = activity;
        this.f94886f = mVar;
        mo69674a();
    }
}
