package com.bytedance.ies.xelement.pickview;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.pickview.p1391a.C19382a;
import com.bytedance.ies.xelement.pickview.p1392b.AbstractC19385a;
import com.bytedance.ies.xelement.pickview.p1392b.AbstractC19387c;
import com.bytedance.ies.xelement.pickview.p1392b.AbstractC19392g;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.ies.xelement.pickview.p1392b.C19388d;
import com.bytedance.ies.xelement.pickview.p1392b.C19390e;
import com.bytedance.ies.xelement.pickview.p1392b.C19391f;
import com.bytedance.ies.xelement.pickview.p1393c.AbstractC19394b;
import com.bytedance.ies.xelement.pickview.p1395e.C19398a;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxPickerViewColumn extends LynxUI<C19398a> {

    /* renamed from: b */
    public static final C19376a f45883b = new C19376a((byte) 0);

    /* renamed from: a */
    public boolean f45884a;

    /* renamed from: c */
    private AbstractC28367a f45885c;

    /* renamed from: d */
    private AbstractC28367a f45886d;

    /* renamed from: e */
    private AbstractC19054a f45887e;

    static {
        Covode.recordClassIndex(22168);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (nextKey.hashCode()) {
                case -752785969:
                    if (nextKey.equals("range-key")) {
                        setRangeKey(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -208291852:
                    if (nextKey.equals("visible-count")) {
                        setVisibleCount(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 108280125:
                    if (nextKey.equals("range")) {
                        setRange(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 111972721:
                    if (nextKey.equals("value")) {
                        setValue(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1256871824:
                    if (nextKey.equals("mask-style")) {
                        setMaskStyle(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 2065426547:
                    if (nextKey.equals("indicator-style")) {
                        setIndicatorStyle(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.LynxPickerViewColumn$a */
    public static final class C19376a {
        static {
            Covode.recordClassIndex(22171);
        }

        private C19376a() {
        }

        public /* synthetic */ C19376a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.LynxPickerViewColumn$c */
    public static final class C19378c implements AbstractC19387c {

        /* renamed from: a */
        final /* synthetic */ LynxPickerViewColumn f45889a;

        static {
            Covode.recordClassIndex(22173);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19378c(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f45889a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.p1392b.AbstractC19387c
        /* renamed from: c */
        public final void mo30902c(String str) {
            C89219l.m154719c(str, "");
            ((C19398a) this.f45889a.mView).setCenterWeight(str);
        }

        @Override // com.bytedance.ies.xelement.pickview.p1392b.AbstractC19387c
        /* renamed from: a */
        public final void mo30900a(String str) {
            C89219l.m154719c(str, "");
            ((C19398a) this.f45889a.mView).setTextSizePx(C19390e.m36188a(this.f45889a.mContext, str));
        }

        @Override // com.bytedance.ies.xelement.pickview.p1392b.AbstractC19387c
        /* renamed from: b */
        public final void mo30901b(String str) {
            C89219l.m154719c(str, "");
            Long a = C19390e.m36189a(str);
            if (a != null) {
                int longValue = (int) a.longValue();
                ((C19398a) this.f45889a.mView).setTextColorCenter(longValue);
                ((C19398a) this.f45889a.mView).setTextColorOut(longValue);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.LynxPickerViewColumn$d */
    public static final class C19379d implements AbstractC19385a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerViewColumn f45890a;

        static {
            Covode.recordClassIndex(22174);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19379d(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f45890a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.p1392b.AbstractC19385a
        /* renamed from: a */
        public final void mo30903a(String str) {
            C89219l.m154719c(str, "");
            ((C19398a) this.f45890a.mView).setDividerWidth(C19390e.m36188a(this.f45890a.mContext, str));
        }

        @Override // com.bytedance.ies.xelement.pickview.p1392b.AbstractC19385a
        /* renamed from: b */
        public final void mo30904b(String str) {
            C89219l.m154719c(str, "");
            Long a = C19390e.m36189a(str);
            if (a != null) {
                ((C19398a) this.f45890a.mView).setDividerColor((int) a.longValue());
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.LynxPickerViewColumn$e */
    public static final class C19380e implements AbstractC19392g {

        /* renamed from: a */
        final /* synthetic */ LynxPickerViewColumn f45891a;

        static {
            Covode.recordClassIndex(22175);
        }

        @Override // com.bytedance.ies.xelement.pickview.p1392b.AbstractC19392g
        /* renamed from: b */
        public final void mo30906b(String str) {
            C89219l.m154719c(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19380e(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f45891a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.p1392b.AbstractC19392g
        /* renamed from: a */
        public final void mo30905a(String str) {
            C89219l.m154719c(str, "");
            ((C19398a) this.f45891a.mView).setUserItemHeight(C19390e.m36188a(this.f45891a.mContext, str));
        }
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.LynxPickerViewColumn$f */
    public static final class C19381f implements AbstractC19392g {

        /* renamed from: a */
        final /* synthetic */ LynxPickerViewColumn f45892a;

        static {
            Covode.recordClassIndex(22176);
        }

        @Override // com.bytedance.ies.xelement.pickview.p1392b.AbstractC19392g
        /* renamed from: a */
        public final void mo30905a(String str) {
            C89219l.m154719c(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19381f(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f45892a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.p1392b.AbstractC19392g
        /* renamed from: b */
        public final void mo30906b(String str) {
            C89219l.m154719c(str, "");
            Long a = C19390e.m36189a(str);
            if (a != null) {
                ((C19398a) this.f45892a.mView).setMaskColor((int) a.longValue());
            }
        }
    }

    @AbstractC28525m(mo49059a = "range-key")
    public final void setRangeKey(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        this.f45886d = aVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f45884a = map.containsKey("change");
        }
    }

    @AbstractC28525m(mo49059a = "mask-style")
    public final void setMaskStyle(String str) {
        C89219l.m154719c(str, "");
        C19391f.m36192a(C19388d.m36186a(str), new C19381f(this));
    }

    @AbstractC28525m(mo49059a = "visible-count")
    public final void setVisibleCount(String str) {
        int i;
        C89219l.m154719c(str, "");
        try {
            i = Integer.parseInt(str);
        } catch (Exception unused) {
            i = 5;
        }
        ((C19398a) this.mView).setItemsVisibleCount(i);
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.LynxPickerViewColumn$b */
    static final class C19377b implements AbstractC19394b {

        /* renamed from: a */
        final /* synthetic */ LynxPickerViewColumn f45888a;

        static {
            Covode.recordClassIndex(22172);
        }

        C19377b(LynxPickerViewColumn lynxPickerViewColumn) {
            this.f45888a = lynxPickerViewColumn;
        }

        @Override // com.bytedance.ies.xelement.pickview.p1393c.AbstractC19394b
        /* renamed from: a */
        public final void mo30899a(int i) {
            if (this.f45888a.f45884a) {
                C28725c cVar = new C28725c(this.f45888a.getSign(), "change");
                cVar.mo49838a("value", Integer.valueOf(i));
                AbstractC28520j jVar = this.f45888a.mContext;
                C89219l.m154709a((Object) jVar, "");
                jVar.f67064e.mo49834a(cVar);
            }
        }
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ C19398a createView(Context context) {
        C19398a aVar = new C19398a(context);
        aVar.setLocalizeAdapter(this.f45887e);
        aVar.setCyclic(false);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aVar.setOnItemSelectedListener(new C19377b(this));
        aVar.setCurrentIndex(0);
        return aVar;
    }

    @AbstractC28525m(mo49059a = "indicator-style")
    public final void setIndicatorStyle(String str) {
        C89219l.m154719c(str, "");
        List<C89378p<String, String>> a = C19388d.m36186a(str);
        C19378c cVar = new C19378c(this);
        C89219l.m154719c(a, "");
        C89219l.m154719c(cVar, "");
        String a2 = C19391f.m36191a(a, C19386b.f45895b);
        if (a2 != null) {
            cVar.mo30900a(a2);
        }
        String a3 = C19391f.m36191a(a, C19386b.f45894a);
        if (a3 != null) {
            cVar.mo30901b(a3);
        }
        String a4 = C19391f.m36191a(a, C19386b.f45896c);
        if (a4 != null) {
            cVar.mo30902c(a4);
        }
        C19379d dVar = new C19379d(this);
        C89219l.m154719c(a, "");
        C89219l.m154719c(dVar, "");
        String a5 = C19391f.m36191a(a, C19386b.f45897d);
        if (a5 != null) {
            dVar.mo30903a(a5);
        }
        String a6 = C19391f.m36191a(a, C19386b.f45898e);
        if (a6 != null) {
            dVar.mo30904b(a6);
        }
        C19391f.m36192a(a, new C19380e(this));
    }

    @AbstractC28525m(mo49059a = "value")
    public final void setValue(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        int i = 0;
        if (aVar.mo48559h() == ReadableType.String) {
            try {
                String e = aVar.mo48556e();
                C89219l.m154709a((Object) e, "");
                i = Integer.parseInt(e);
            } catch (Exception unused) {
            }
        } else if (aVar.mo48559h() == ReadableType.Int || aVar.mo48559h() == ReadableType.Long) {
            i = aVar.mo48555d();
        } else if (aVar.mo48559h() == ReadableType.Number) {
            i = (int) aVar.mo48554c();
        }
        C19398a aVar2 = (C19398a) this.mView;
        if (aVar2 != null) {
            aVar2.setCurrentIndex(i);
        }
    }

    @AbstractC28525m(mo49059a = "range")
    public final void setRange(AbstractC28367a aVar) {
        ReadableArray f;
        String e;
        C89219l.m154719c(aVar, "");
        this.f45885c = aVar;
        if (!(aVar.mo48559h() != ReadableType.Array || aVar.mo48552a() || 1 == 0 || (f = aVar.mo48557f()) == null || f.size() <= 0 || f.isNull(0))) {
            ArrayList arrayList = new ArrayList();
            if (f.getType(0) == ReadableType.String) {
                ArrayList<Object> arrayList2 = f.toArrayList();
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                AbstractC28367a aVar2 = this.f45886d;
                if (!(aVar2 == null || (e = aVar2.mo48556e()) == null)) {
                    int size = f.size();
                    for (int i = 0; i < size; i++) {
                        String string = f.getMap(i).getString(e);
                        C89219l.m154709a((Object) string, "");
                        arrayList.add(string);
                    }
                }
            }
            C19398a aVar3 = (C19398a) this.mView;
            C89219l.m154709a((Object) aVar3, "");
            aVar3.setAdapter(new C19382a(arrayList));
            ((C19398a) this.mView).setItemsVisibleCount(5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxPickerViewColumn(AbstractC28520j jVar, AbstractC19054a aVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(aVar, "");
        this.f45887e = aVar;
    }
}
