package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45886d;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46085d;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46105p;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.n */
public final class C46161n extends LinearLayout {

    /* renamed from: a */
    List<C46162a> f107496a = new ArrayList();

    /* renamed from: b */
    final Drawable f107497b;

    /* renamed from: c */
    private boolean f107498c = true;

    /* renamed from: d */
    private int f107499d = -1;

    /* renamed from: e */
    private int f107500e = -1;

    /* renamed from: f */
    private String f107501f = " ";

    /* renamed from: g */
    private boolean f107502g;

    /* renamed from: h */
    private int f107503h;

    /* renamed from: i */
    private InnerEffectTextLayoutConfig f107504i;

    /* renamed from: j */
    private final View.OnFocusChangeListener f107505j = new View$OnFocusChangeListenerC46165d(this);

    /* renamed from: k */
    private float f107506k;

    static {
        Covode.recordClassIndex(54720);
    }

    public final List<C46162a> getEditTextList() {
        return this.f107496a;
    }

    public final boolean getEditable() {
        return this.f107498c;
    }

    public final String getHintString() {
        return this.f107501f;
    }

    public final InnerEffectTextLayoutConfig getInnerLayoutConfig() {
        return this.f107504i;
    }

    public final int getMaxTextWidth() {
        return this.f107499d;
    }

    public final int getMaxViewWidth() {
        return this.f107500e;
    }

    public final boolean getShowHint() {
        return this.f107502g;
    }

    /* renamed from: a */
    public final void mo78373a() {
        for (T t : this.f107496a) {
            t.f107507a.setMinWidth(t.f107507a.getWidth());
        }
    }

    public final AppCompatEditText getFocusableEditText() {
        T t;
        Iterator<T> it = this.f107496a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f107507a.hasFocus()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return t2.f107507a;
        }
        return null;
    }

    public final void setShowHint(boolean z) {
        this.f107502g = z;
    }

    public final void setEditTextList(List<C46162a> list) {
        C89219l.m154721d(list, "");
        this.f107496a = list;
    }

    public final void setHintString(String str) {
        C89219l.m154721d(str, "");
        this.f107501f = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.n$a */
    public static final class C46162a {

        /* renamed from: a */
        public C46147i f107507a;

        /* renamed from: b */
        public InnerEffectTextConfig f107508b = null;

        static {
            Covode.recordClassIndex(54721);
        }

        public C46162a(C46147i iVar) {
            C89219l.m154721d(iVar, "");
            this.f107507a = iVar;
        }
    }

    public final void setRotation(float f) {
        if (this.f107504i != null) {
            super.setRotation(f + this.f107506k);
        } else {
            super.setRotation(f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46161n(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11683);
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        this.f107497b = context2.getResources().getDrawable(R.drawable.a81);
        MethodCollector.m26664o(11683);
    }

    public final void setEditable(boolean z) {
        if (this.f107498c != z) {
            this.f107498c = z;
            Iterator<T> it = this.f107496a.iterator();
            while (it.hasNext()) {
                C45886d.m88529a(it.next().f107507a, this.f107498c);
            }
        }
    }

    public final void setMaxTextWidth(int i) {
        if (this.f107499d != i) {
            this.f107499d = i;
            Iterator<T> it = this.f107496a.iterator();
            while (it.hasNext()) {
                it.next().f107507a.setMaxWidth(this.f107499d);
            }
        }
    }

    public final void setMaxViewWidth(int i) {
        if (this.f107500e != i) {
            this.f107500e = i;
            Iterator<T> it = this.f107496a.iterator();
            while (it.hasNext()) {
                it.next().f107507a.setMaxViewWidth(this.f107500e);
            }
        }
    }

    public final void setInnerLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        if (!C89219l.m154714a(this.f107504i, innerEffectTextLayoutConfig)) {
            this.f107504i = innerEffectTextLayoutConfig;
            setOrientation(1);
            this.f107506k = 0.0f;
            setRotation(0.0f);
            setPadding(0, 0, 0, 0);
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfig2 = this.f107504i;
            if (innerEffectTextLayoutConfig2 != null) {
                setOrientation(innerEffectTextLayoutConfig2.getOrientation());
                this.f107506k = innerEffectTextLayoutConfig2.getRotation();
                setRotation(0.0f);
                setPadding(innerEffectTextLayoutConfig2.getPaddingStart(), innerEffectTextLayoutConfig2.getPaddingTop(), innerEffectTextLayoutConfig2.getPaddingEnd(), innerEffectTextLayoutConfig2.getPaddingBottom());
                List<InnerEffectTextConfig> textConfigs = innerEffectTextLayoutConfig2.getTextConfigs();
                C46163b bVar = new C46163b(this);
                if (textConfigs.size() < this.f107496a.size()) {
                    int size = this.f107496a.size() - 1;
                    int size2 = textConfigs.size();
                    if (size >= size2) {
                        while (true) {
                            removeView(this.f107496a.get(size).f107507a);
                            this.f107496a.remove(size);
                            if (size == size2) {
                                break;
                            }
                            size--;
                        }
                    }
                } else if (textConfigs.size() > this.f107496a.size()) {
                    int size3 = textConfigs.size();
                    for (int size4 = this.f107496a.size(); size4 < size3; size4++) {
                        Context context = getContext();
                        C89219l.m154716b(context, "");
                        C46147i iVar = new C46147i(context, (byte) 0);
                        iVar.setMaxWidth(this.f107499d);
                        iVar.setMaxViewWidth(this.f107500e);
                        addView(iVar);
                        iVar.setOnFocusChangeListener(this.f107505j);
                        this.f107496a.add(new C46162a(iVar));
                    }
                }
                int size5 = textConfigs.size();
                for (int i = 0; i < size5; i++) {
                    InnerEffectTextConfig innerEffectTextConfig = textConfigs.get(i);
                    this.f107496a.get(i).f107508b = innerEffectTextConfig;
                    bVar.mo78391a(this.f107496a.get(i).f107507a, innerEffectTextConfig);
                }
                return;
            }
            return;
        }
        invalidate();
    }

    public final void setText(List<C46105p> list) {
        T t;
        C89219l.m154721d(list, "");
        C46164c cVar = new C46164c(this);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f107358d) {
                break;
            }
        }
        int i = 0;
        if (t != null) {
            this.f107503h = list.indexOf(t);
        } else if (!list.isEmpty()) {
            int size = list.size();
            int i2 = this.f107503h;
            if (size > i2) {
                list.get(i2).f107358d = true;
            } else {
                list.get(0).f107358d = true;
            }
        }
        if (list.size() > this.f107496a.size()) {
            int size2 = this.f107496a.size() - 1;
            while (i < size2) {
                cVar.mo78392a(this.f107496a.get(i).f107507a, list.get(i));
                i++;
            }
            ArrayList arrayList = new ArrayList();
            int size3 = list.size();
            for (int size4 = this.f107496a.size() - 1; size4 < size3; size4++) {
                arrayList.add(list.get(size4));
            }
            C46105p a = C46085d.m88947a(arrayList);
            List<C46162a> list2 = this.f107496a;
            cVar.mo78392a(list2.get(list2.size() - 1).f107507a, a);
        } else if (list.size() < this.f107496a.size()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            int size5 = this.f107496a.size();
            for (int size6 = list.size(); size6 < size5; size6++) {
                arrayList2.add(new C46105p(null, 0, false, false, 15));
            }
            int size7 = arrayList2.size();
            while (i < size7) {
                cVar.mo78392a(this.f107496a.get(i).f107507a, (C46105p) arrayList2.get(i));
                i++;
            }
        } else {
            int size8 = list.size();
            while (i < size8) {
                cVar.mo78392a(this.f107496a.get(i).f107507a, list.get(i));
                i++;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.n$b */
    static final class C46163b extends AbstractC89220m implements AbstractC89183m<C46147i, InnerEffectTextConfig, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C46161n f107509a;

        static {
            Covode.recordClassIndex(54722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46163b(C46161n nVar) {
            super(2);
            this.f107509a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C46147i iVar, InnerEffectTextConfig innerEffectTextConfig) {
            mo78391a(iVar, innerEffectTextConfig);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo78391a(C46147i iVar, InnerEffectTextConfig innerEffectTextConfig) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(innerEffectTextConfig, "");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = innerEffectTextConfig.getMarginStart();
            layoutParams.rightMargin = innerEffectTextConfig.getMarginEnd();
            layoutParams.topMargin = innerEffectTextConfig.getMarginTop();
            layoutParams.bottomMargin = innerEffectTextConfig.getMarginBottom();
            iVar.setLayoutParams(layoutParams);
            iVar.setInnerTextConfig(innerEffectTextConfig);
            iVar.setBackground(null);
            C45886d.m88529a(iVar, this.f107509a.getEditable());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.n$c */
    static final class C46164c extends AbstractC89220m implements AbstractC89183m<C46147i, C46105p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C46161n f107510a;

        static {
            Covode.recordClassIndex(54723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46164c(C46161n nVar) {
            super(2);
            this.f107510a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C46147i iVar, C46105p pVar) {
            mo78392a(iVar, pVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo78392a(C46147i iVar, C46105p pVar) {
            Editable text;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(pVar, "");
            iVar.setText(pVar.f107355a);
            if (pVar.f107358d) {
                iVar.setSelection(Math.min(String.valueOf(iVar.getText()).length(), pVar.f107356b));
                C45886d.m88527a(iVar);
            } else {
                String str = " ";
                if (this.f107510a.getShowHint() && ((text = iVar.getText()) == null || text.length() == 0)) {
                    str = this.f107510a.getHintString();
                }
                iVar.setHint(str);
            }
            iVar.setTextColor(pVar.f107357c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.n$d */
    static final class View$OnFocusChangeListenerC46165d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C46161n f107511a;

        static {
            Covode.recordClassIndex(54724);
        }

        View$OnFocusChangeListenerC46165d(C46161n nVar) {
            this.f107511a = nVar;
        }

        public final void onFocusChange(View view, boolean z) {
            EditText editText;
            Editable text;
            if ((view instanceof EditText) && this.f107511a.getEditable()) {
                if (z || !((text = (editText = (EditText) view).getText()) == null || text.length() == 0)) {
                    ((EditText) view).setHint(" ");
                } else {
                    editText.setHint(this.f107511a.getHintString());
                }
            }
        }
    }
}
