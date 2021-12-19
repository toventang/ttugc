package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.picker.p1384a.C19326b;
import com.bytedance.ies.xelement.picker.p1386c.C19333a;
import com.bytedance.ies.xelement.picker.p1386c.C19335c;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19339c;
import com.bytedance.ies.xelement.picker.view.WheelView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.ies.xelement.picker.view.b */
public final class View$OnClickListenerC19361b extends AbstractC19354a implements View.OnClickListener {

    /* renamed from: j */
    public C19335c f45832j;

    /* renamed from: k */
    private C19366e f45833k;

    static {
        Covode.recordClassIndex(22150);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.picker.view.AbstractC19354a
    /* renamed from: a */
    public final C19333a mo30848a() {
        return this.f45832j;
    }

    @Override // com.bytedance.ies.xelement.picker.view.AbstractC19354a
    /* renamed from: h */
    public final boolean mo30857h() {
        return this.f45832j.f45715w;
    }

    /* renamed from: i */
    public final String mo30865i() {
        String str;
        Calendar a = this.f45833k.mo30870a();
        if (this.f45832j.f45749Y != null) {
            str = this.f45832j.f45749Y;
        } else {
            str = "-";
        }
        int i = a.get(1);
        int i2 = a.get(2) + 1;
        int i3 = a.get(5);
        boolean[] zArr = this.f45832j.f45730F;
        if (zArr.length != 3) {
            return C1764a.m5929a(Locale.getDefault(), "%04d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str, Integer.valueOf(i3)});
        } else if (zArr[2]) {
            return C1764a.m5929a(Locale.getDefault(), "%04d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str, Integer.valueOf(i3)});
        } else if (zArr[1]) {
            return C1764a.m5929a(Locale.getDefault(), "%04d%s%02d", new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2)});
        } else {
            return C1764a.m5929a(Locale.getDefault(), "%04d", new Object[]{Integer.valueOf(i)});
        }
    }

    public final void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.f45832j.f45728D != null) {
                this.f45832j.f45728D.mo30772a(mo30865i());
            }
            this.f45818i = true;
        } else if (str.equals("cancel")) {
            if (this.f45832j.f45693a != null) {
                this.f45832j.f45693a.mo30773a();
            }
            this.f45818i = true;
        }
        mo30854e();
    }

    public View$OnClickListenerC19361b(C19335c cVar) {
        super(cVar.f45698f);
        int i;
        String str;
        String str2;
        String str3;
        MethodCollector.m26663i(7892);
        this.f45832j = cVar;
        Context context = cVar.f45698f;
        mo30856g();
        mo30851b();
        mo30852c();
        if (this.f45832j.f45694b == null) {
            LayoutInflater.from(context).inflate(R.layout.ajv, this.f45810a);
            TextView textView = (TextView) mo30847a(R.id.ers);
            RelativeLayout relativeLayout = (RelativeLayout) mo30847a(R.id.dom);
            Button button = (Button) mo30847a(R.id.ws);
            Button button2 = (Button) mo30847a(R.id.wq);
            button.setTag("submit");
            button2.setTag("cancel");
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            Map<String, String> a = this.f45832j.f45748X.mo16277a();
            if (TextUtils.isEmpty(this.f45832j.f45699g)) {
                str = a.get("confirm");
            } else {
                str = this.f45832j.f45699g;
            }
            button.setText(str);
            if (TextUtils.isEmpty(this.f45832j.f45700h)) {
                str2 = a.get("cancel");
            } else {
                str2 = this.f45832j.f45700h;
            }
            button2.setText(str2);
            if (TextUtils.isEmpty(this.f45832j.f45701i)) {
                str3 = "";
            } else {
                str3 = this.f45832j.f45701i;
            }
            textView.setText(str3);
            button.setTextColor(this.f45832j.f45702j);
            button2.setTextColor(this.f45832j.f45703k);
            textView.setTextColor(this.f45832j.f45704l);
            relativeLayout.setBackgroundColor(this.f45832j.f45706n);
            button.setTextSize((float) this.f45832j.f45707o);
            button2.setTextSize((float) this.f45832j.f45707o);
            textView.setTextSize((float) this.f45832j.f45708p);
        } else {
            LayoutInflater.from(context).inflate(this.f45832j.f45695c, this.f45810a);
        }
        LinearLayout linearLayout = (LinearLayout) mo30847a(R.id.ahm);
        linearLayout.setBackgroundColor(this.f45832j.f45705m);
        this.f45833k = new C19366e(linearLayout, this.f45832j.f45730F, this.f45832j.f45697e, this.f45832j.f45709q, this.f45832j.f45748X);
        if (this.f45832j.f45729E != null) {
            this.f45833k.f45855n = new AbstractC19339c() {
                /* class com.bytedance.ies.xelement.picker.view.View$OnClickListenerC19361b.C193621 */

                static {
                    Covode.recordClassIndex(22151);
                }

                @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19339c
                /* renamed from: a */
                public final void mo30807a() {
                    View$OnClickListenerC19361b.this.mo30865i();
                }
            };
        }
        if (this.f45832j.f45733I == null) {
            this.f45832j.f45733I = Calendar.getInstance();
            this.f45832j.f45733I.set(1900, 0, 1);
        }
        if (this.f45832j.f45734J == null) {
            this.f45832j.f45734J = Calendar.getInstance();
            this.f45832j.f45734J.set(2100, 11, 31);
        }
        if (this.f45832j.f45733I.get(1) < 1900 || this.f45832j.f45733I.get(1) > 2100) {
            this.f45832j.f45733I.set(1900, 0, 1);
        }
        if (this.f45832j.f45734J.get(1) < 1900 || this.f45832j.f45734J.get(1) > 2100) {
            this.f45832j.f45734J.set(2100, 11, 31);
        }
        C19366e eVar = this.f45833k;
        Calendar calendar = this.f45832j.f45733I;
        Calendar calendar2 = this.f45832j.f45734J;
        if (calendar == null) {
            if (calendar2 != null) {
                int i2 = calendar2.get(1);
                int i3 = calendar2.get(2) + 1;
                int i4 = calendar2.get(5);
                if (i2 > eVar.f45846e) {
                    eVar.f45847f = i2;
                    eVar.f45849h = i3;
                    eVar.f45851j = i4;
                } else if (i2 == eVar.f45846e) {
                    if (i3 > eVar.f45848g) {
                        eVar.f45847f = i2;
                        eVar.f45849h = i3;
                        eVar.f45851j = i4;
                    } else if (i3 == eVar.f45848g && i4 > eVar.f45850i) {
                        eVar.f45847f = i2;
                        eVar.f45849h = i3;
                        eVar.f45851j = i4;
                    }
                }
            }
        } else if (calendar2 == null) {
            int i5 = calendar.get(1);
            int i6 = calendar.get(2) + 1;
            int i7 = calendar.get(5);
            if (i5 < eVar.f45847f) {
                eVar.f45848g = i6;
                eVar.f45850i = i7;
                eVar.f45846e = i5;
            } else if (i5 == eVar.f45847f) {
                if (i6 < eVar.f45849h) {
                    eVar.f45848g = i6;
                    eVar.f45850i = i7;
                    eVar.f45846e = i5;
                } else if (i6 == eVar.f45849h && i7 < eVar.f45851j) {
                    eVar.f45848g = i6;
                    eVar.f45850i = i7;
                    eVar.f45846e = i5;
                }
            }
        } else {
            eVar.f45846e = calendar.get(1);
            eVar.f45847f = calendar2.get(1);
            eVar.f45848g = calendar.get(2) + 1;
            eVar.f45849h = calendar2.get(2) + 1;
            eVar.f45850i = calendar.get(5);
            eVar.f45851j = calendar2.get(5);
        }
        if (this.f45832j.f45733I == null || this.f45832j.f45734J == null) {
            IllegalStateException illegalStateException = new IllegalStateException("you should call setRangDate() first");
            MethodCollector.m26664o(7892);
            throw illegalStateException;
        }
        if (this.f45832j.f45732H == null) {
            this.f45832j.f45732H = Calendar.getInstance();
        }
        if (this.f45832j.f45732H.getTimeInMillis() < this.f45832j.f45733I.getTimeInMillis()) {
            this.f45832j.f45732H.setTimeInMillis(this.f45832j.f45733I.getTimeInMillis());
        }
        if (this.f45832j.f45732H.getTimeInMillis() > this.f45832j.f45734J.getTimeInMillis()) {
            this.f45832j.f45732H.setTimeInMillis(this.f45832j.f45734J.getTimeInMillis());
        }
        int i8 = this.f45832j.f45732H.get(1);
        int i9 = this.f45832j.f45732H.get(2) + 1;
        int i10 = this.f45832j.f45732H.get(5);
        C19366e eVar2 = this.f45833k;
        eVar2.f45852k = i8;
        eVar2.f45853l = i9;
        eVar2.f45854m = i10;
        eVar2.f45843b.setAdapter(new C19326b(eVar2.f45846e, eVar2.f45847f));
        eVar2.f45843b.setCurrentIndex(i8 - eVar2.f45846e);
        int i11 = 12;
        if (eVar2.f45846e == eVar2.f45847f) {
            i = eVar2.f45848g;
            i11 = eVar2.f45849h;
        } else if (i8 == eVar2.f45846e) {
            i = eVar2.f45848g;
        } else {
            i11 = i8 == eVar2.f45847f ? eVar2.f45849h : i11;
            i = 1;
        }
        eVar2.f45844c.setAdapter(new C19326b(i, i11));
        eVar2.f45844c.setCurrentIndex(i9 - i);
        eVar2.mo30871a(true, i8, i9, i10);
        C19366e eVar3 = this.f45833k;
        String str4 = this.f45832j.f45736L;
        String str5 = this.f45832j.f45737M;
        String str6 = this.f45832j.f45738N;
        if (str4 != null) {
            eVar3.f45843b.setLabel(str4);
        }
        if (str5 != null) {
            eVar3.f45844c.setLabel(str5);
        }
        if (str6 != null) {
            eVar3.f45845d.setLabel(str6);
        }
        C19366e eVar4 = this.f45833k;
        int i12 = this.f45832j.f45742R;
        int i13 = this.f45832j.f45743S;
        int i14 = this.f45832j.f45744T;
        eVar4.f45843b.setTextXOffset(i12);
        eVar4.f45844c.setTextXOffset(i13);
        eVar4.f45845d.setTextXOffset(i14);
        C19366e eVar5 = this.f45833k;
        int i15 = this.f45832j.f45691B;
        eVar5.f45845d.setItemsVisibleCount(i15);
        eVar5.f45844c.setItemsVisibleCount(i15);
        eVar5.f45843b.setItemsVisibleCount(i15);
        C19366e eVar6 = this.f45833k;
        boolean z = this.f45832j.f45692C;
        eVar6.f45845d.setAlphaGradient(z);
        eVar6.f45844c.setAlphaGradient(z);
        eVar6.f45843b.setAlphaGradient(z);
        mo30849a(this.f45832j.f45716x);
        C19366e eVar7 = this.f45833k;
        boolean z2 = this.f45832j.f45735K;
        eVar7.f45843b.setCyclic(z2);
        eVar7.f45844c.setCyclic(z2);
        eVar7.f45845d.setCyclic(z2);
        C19366e eVar8 = this.f45833k;
        int i16 = this.f45832j.f45712t;
        eVar8.f45845d.setDividerColor(i16);
        eVar8.f45844c.setDividerColor(i16);
        eVar8.f45843b.setDividerColor(i16);
        C19366e eVar9 = this.f45833k;
        WheelView.EnumC19353b bVar = this.f45832j.f45690A;
        eVar9.f45845d.setDividerType(bVar);
        eVar9.f45844c.setDividerType(bVar);
        eVar9.f45843b.setDividerType(bVar);
        C19366e eVar10 = this.f45833k;
        float f = this.f45832j.f45714v;
        eVar10.f45845d.setLineSpacingMultiplier(f);
        eVar10.f45844c.setLineSpacingMultiplier(f);
        eVar10.f45843b.setLineSpacingMultiplier(f);
        C19366e eVar11 = this.f45833k;
        int i17 = this.f45832j.f45710r;
        eVar11.f45845d.setTextColorOut(i17);
        eVar11.f45844c.setTextColorOut(i17);
        eVar11.f45843b.setTextColorOut(i17);
        C19366e eVar12 = this.f45833k;
        int i18 = this.f45832j.f45711s;
        eVar12.f45845d.setTextColorCenter(i18);
        eVar12.f45844c.setTextColorCenter(i18);
        eVar12.f45843b.setTextColorCenter(i18);
        C19366e eVar13 = this.f45833k;
        boolean z3 = this.f45832j.f45717y;
        eVar13.f45845d.f45783b = z3;
        eVar13.f45844c.f45783b = z3;
        eVar13.f45843b.f45783b = z3;
        MethodCollector.m26664o(7892);
    }
}
