package com.bytedance.ies.xelement.picker;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.picker.p1385b.C19330b;
import com.bytedance.ies.xelement.picker.p1385b.C19331c;
import com.bytedance.ies.xelement.picker.p1385b.C19332d;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19337a;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19343g;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19344h;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19346j;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.utils.C28930n;
import com.lynx.tasm.utils.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxPickerView extends UISimpleView<C28698a> {

    /* renamed from: t */
    public static final C19310a f45632t = new C19310a((byte) 0);

    /* renamed from: a */
    public String f45633a;

    /* renamed from: b */
    AbstractC28367a f45634b;

    /* renamed from: c */
    AbstractC28367a f45635c;

    /* renamed from: d */
    AbstractC28367a f45636d;

    /* renamed from: e */
    String f45637e;

    /* renamed from: f */
    String f45638f;

    /* renamed from: g */
    String f45639g;

    /* renamed from: h */
    String f45640h;

    /* renamed from: i */
    public String f45641i;

    /* renamed from: j */
    public String f45642j;

    /* renamed from: k */
    String f45643k;

    /* renamed from: l */
    String f45644l;

    /* renamed from: m */
    String f45645m;

    /* renamed from: n */
    String f45646n;

    /* renamed from: o */
    String f45647o;

    /* renamed from: p */
    public boolean f45648p;

    /* renamed from: q */
    public boolean f45649q;

    /* renamed from: r */
    public boolean f45650r;

    /* renamed from: s */
    AbstractC19054a f45651s;

    static {
        Covode.recordClassIndex(22095);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (nextKey.hashCode()) {
                case -1274708295:
                    if (nextKey.equals("fields")) {
                        setFields(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -854975978:
                    if (nextKey.equals("confirm-color")) {
                        setConfirmColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -752785969:
                    if (nextKey.equals("range-key")) {
                        setRangeKey(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -586660946:
                    if (nextKey.equals("title-color")) {
                        setTitleColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -271594562:
                    if (nextKey.equals("confirm-string")) {
                        setConfirmString(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -28424822:
                    if (nextKey.equals("title-font-size")) {
                        setTitleFontSize(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 100571:
                    if (nextKey.equals("end")) {
                        setEnd(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextKey.equals("mode")) {
                        setMode(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 49495748:
                    if (nextKey.equals("cancel-string")) {
                        setCancelString(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 108280125:
                    if (nextKey.equals("range")) {
                        setRange(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 109757538:
                    if (nextKey.equals("start")) {
                        setStart(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 110371416:
                    if (nextKey.equals("title")) {
                        setTitle(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 111972721:
                    if (nextKey.equals("value")) {
                        setValue(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1372139088:
                    if (nextKey.equals("cancel-color")) {
                        setCancelColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1732829925:
                    if (nextKey.equals("separator")) {
                        setSeparator(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$a */
    public static final class C19310a {
        static {
            Covode.recordClassIndex(22098);
        }

        private C19310a() {
        }

        public /* synthetic */ C19310a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$c */
    public static final class C19312c implements AbstractC19054a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45654a;

        static {
            Covode.recordClassIndex(22100);
        }

        @Override // com.bytedance.ies.xelement.p1366c.AbstractC19054a
        /* renamed from: a */
        public final Map<String, String> mo16277a() {
            C89378p[] pVarArr = new C89378p[2];
            String str = this.f45654a.f45641i;
            if (str == null) {
                str = "Confirm";
            }
            pVarArr[0] = C89387v.m154943a("confirm", str);
            String str2 = this.f45654a.f45642j;
            if (str2 == null) {
                str2 = "Cancel";
            }
            pVarArr[1] = C89387v.m154943a("cancel", str2);
            return C89041ag.m154421a(pVarArr);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19312c(LynxPickerView lynxPickerView) {
            this.f45654a = lynxPickerView;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$e */
    static final class C19314e implements AbstractC19337a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45656a;

        static {
            Covode.recordClassIndex(22102);
        }

        C19314e(LynxPickerView lynxPickerView) {
            this.f45656a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19337a
        /* renamed from: a */
        public final void mo30773a() {
            if (this.f45656a.f45648p) {
                AbstractC28520j jVar = this.f45656a.mContext;
                C89219l.m154709a((Object) jVar, "");
                jVar.f67064e.mo49834a(new C28725c(this.f45656a.getSign(), "cancel"));
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$f */
    public static final class C19315f implements AbstractC19054a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45657a;

        static {
            Covode.recordClassIndex(22103);
        }

        @Override // com.bytedance.ies.xelement.p1366c.AbstractC19054a
        /* renamed from: a */
        public final Map<String, String> mo16277a() {
            C89378p[] pVarArr = new C89378p[2];
            String str = this.f45657a.f45641i;
            if (str == null) {
                str = "Confirm";
            }
            pVarArr[0] = C89387v.m154943a("confirm", str);
            String str2 = this.f45657a.f45642j;
            if (str2 == null) {
                str2 = "Cancel";
            }
            pVarArr[1] = C89387v.m154943a("cancel", str2);
            return C89041ag.m154421a(pVarArr);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19315f(LynxPickerView lynxPickerView) {
            this.f45657a = lynxPickerView;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$i */
    public static final class C19318i implements AbstractC19337a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45660a;

        static {
            Covode.recordClassIndex(22106);
        }

        C19318i(LynxPickerView lynxPickerView) {
            this.f45660a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19337a
        /* renamed from: a */
        public final void mo30773a() {
            if (this.f45660a.f45648p) {
                AbstractC28520j jVar = this.f45660a.mContext;
                C89219l.m154709a((Object) jVar, "");
                jVar.f67064e.mo49834a(new C28725c(this.f45660a.getSign(), "cancel"));
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$j */
    public static final class C19319j implements AbstractC19054a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45661a;

        /* renamed from: b */
        final /* synthetic */ List f45662b;

        /* renamed from: c */
        final /* synthetic */ Integer f45663c;

        static {
            Covode.recordClassIndex(22107);
        }

        @Override // com.bytedance.ies.xelement.p1366c.AbstractC19054a
        /* renamed from: a */
        public final Map<String, String> mo16277a() {
            C89378p[] pVarArr = new C89378p[2];
            String str = this.f45661a.f45641i;
            if (str == null) {
                str = "Confirm";
            }
            pVarArr[0] = C89387v.m154943a("confirm", str);
            String str2 = this.f45661a.f45642j;
            if (str2 == null) {
                str2 = "Cancel";
            }
            pVarArr[1] = C89387v.m154943a("cancel", str2);
            return C89041ag.m154421a(pVarArr);
        }

        C19319j(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f45661a = lynxPickerView;
            this.f45662b = list;
            this.f45663c = num;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$l */
    static final class C19321l implements AbstractC19337a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45667a;

        /* renamed from: b */
        final /* synthetic */ List f45668b;

        /* renamed from: c */
        final /* synthetic */ Integer f45669c;

        static {
            Covode.recordClassIndex(22109);
        }

        C19321l(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f45667a = lynxPickerView;
            this.f45668b = list;
            this.f45669c = num;
        }

        @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19337a
        /* renamed from: a */
        public final void mo30773a() {
            if (this.f45667a.f45648p) {
                AbstractC28520j jVar = this.f45667a.mContext;
                C89219l.m154709a((Object) jVar, "");
                jVar.f67064e.mo49834a(new C28725c(this.f45667a.getSign(), "cancel"));
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$m */
    public static final class C19322m implements AbstractC19054a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45670a;

        static {
            Covode.recordClassIndex(22110);
        }

        @Override // com.bytedance.ies.xelement.p1366c.AbstractC19054a
        /* renamed from: a */
        public final Map<String, String> mo16277a() {
            C89378p[] pVarArr = new C89378p[2];
            String str = this.f45670a.f45641i;
            if (str == null) {
                str = "Confirm";
            }
            pVarArr[0] = C89387v.m154943a("confirm", str);
            String str2 = this.f45670a.f45642j;
            if (str2 == null) {
                str2 = "Cancel";
            }
            pVarArr[1] = C89387v.m154943a("cancel", str2);
            return C89041ag.m154421a(pVarArr);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19322m(LynxPickerView lynxPickerView) {
            this.f45670a = lynxPickerView;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$o */
    static final class C19324o implements AbstractC19337a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45672a;

        static {
            Covode.recordClassIndex(22112);
        }

        C19324o(LynxPickerView lynxPickerView) {
            this.f45672a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19337a
        /* renamed from: a */
        public final void mo30773a() {
            if (this.f45672a.f45648p) {
                AbstractC28520j jVar = this.f45672a.mContext;
                C89219l.m154709a((Object) jVar, "");
                jVar.f67064e.mo49834a(new C28725c(this.f45672a.getSign(), "cancel"));
            }
        }
    }

    @AbstractC28525m(mo49059a = "cancel-color")
    public final void setCancelColor(String str) {
        this.f45644l = str;
    }

    @AbstractC28525m(mo49059a = "cancel-string")
    public final void setCancelString(String str) {
        this.f45642j = str;
    }

    @AbstractC28525m(mo49059a = "confirm-color")
    public final void setConfirmColor(String str) {
        this.f45643k = str;
    }

    @AbstractC28525m(mo49059a = "confirm-string")
    public final void setConfirmString(String str) {
        this.f45641i = str;
    }

    @AbstractC28525m(mo49059a = "end")
    public final void setEnd(String str) {
        this.f45638f = str;
    }

    @AbstractC28525m(mo49059a = "fields")
    public final void setFields(String str) {
        this.f45639g = str;
    }

    @AbstractC28525m(mo49059a = "range")
    public final void setRange(AbstractC28367a aVar) {
        this.f45635c = aVar;
    }

    @AbstractC28525m(mo49059a = "range-key")
    public final void setRangeKey(AbstractC28367a aVar) {
        this.f45636d = aVar;
    }

    @AbstractC28525m(mo49059a = "separator")
    public final void setSeparator(String str) {
        this.f45640h = str;
    }

    @AbstractC28525m(mo49059a = "start")
    public final void setStart(String str) {
        this.f45637e = str;
    }

    @AbstractC28525m(mo49059a = "title")
    public final void setTitle(String str) {
        this.f45645m = str;
    }

    @AbstractC28525m(mo49059a = "title-color")
    public final void setTitleColor(String str) {
        this.f45646n = str;
    }

    @AbstractC28525m(mo49059a = "title-font-size")
    public final void setTitleFontSize(String str) {
        this.f45647o = str;
    }

    @AbstractC28525m(mo49059a = "value")
    public final void setValue(AbstractC28367a aVar) {
        this.f45634b = aVar;
    }

    @AbstractC28525m(mo49059a = "mode")
    public final void setMode(String str) {
        C89219l.m154719c(str, "");
        this.f45633a = str;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        C89219l.m154719c(context, "");
        C28698a aVar = new C28698a(context);
        aVar.setOnClickListener(new View$OnClickListenerC19311b(this, context));
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f45648p = map.containsKey("cancel");
            this.f45649q = map.containsKey("change");
            this.f45650r = map.containsKey("columnchange");
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$d */
    static final class C19313d implements AbstractC19346j {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45655a;

        static {
            Covode.recordClassIndex(22101);
        }

        C19313d(LynxPickerView lynxPickerView) {
            this.f45655a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19346j
        /* renamed from: a */
        public final void mo30772a(String str) {
            if (this.f45655a.f45649q) {
                AbstractC28520j jVar = this.f45655a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f45655a.getSign(), "change");
                cVar2.mo49838a("value", str);
                cVar.mo49834a(cVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$g */
    public static final class C19316g implements AbstractC19344h {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45658a;

        static {
            Covode.recordClassIndex(22104);
        }

        C19316g(LynxPickerView lynxPickerView) {
            this.f45658a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19344h
        /* renamed from: a */
        public final void mo30774a(List<Integer> list) {
            if (this.f45658a.f45649q) {
                AbstractC28520j jVar = this.f45658a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f45658a.getSign(), "change");
                cVar2.mo49838a("value", list);
                cVar.mo49834a(cVar2);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$k */
    static final class C19320k implements AbstractC19344h {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45664a;

        /* renamed from: b */
        final /* synthetic */ List f45665b;

        /* renamed from: c */
        final /* synthetic */ Integer f45666c;

        static {
            Covode.recordClassIndex(22108);
        }

        C19320k(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f45664a = lynxPickerView;
            this.f45665b = list;
            this.f45666c = num;
        }

        @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19344h
        /* renamed from: a */
        public final void mo30774a(List<Integer> list) {
            if (this.f45664a.f45649q) {
                AbstractC28520j jVar = this.f45664a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f45664a.getSign(), "change");
                cVar2.mo49838a("value", list.get(0));
                cVar.mo49834a(cVar2);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$n */
    static final class C19323n implements AbstractC19346j {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45671a;

        static {
            Covode.recordClassIndex(22111);
        }

        C19323n(LynxPickerView lynxPickerView) {
            this.f45671a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19346j
        /* renamed from: a */
        public final void mo30772a(String str) {
            if (this.f45671a.f45649q) {
                AbstractC28520j jVar = this.f45671a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f45671a.getSign(), "change");
                cVar2.mo49838a("value", str);
                cVar.mo49834a(cVar2);
            }
        }
    }

    /* renamed from: a */
    public final void mo30755a(Context context) {
        ReadableArray f;
        AbstractC19054a fVar;
        ReadableArray f2;
        ReadableArray f3;
        String string;
        AbstractC28367a aVar = this.f45635c;
        if (!(aVar == null || aVar.mo48559h() != ReadableType.Array || aVar.mo48552a())) {
            ArrayList arrayList = null;
            if (!(1 == 0 || (f = aVar.mo48557f()) == null)) {
                ArrayList arrayList2 = new ArrayList();
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    ReadableArray array = f.getArray(i);
                    ArrayList arrayList3 = new ArrayList();
                    if (!array.isNull(0)) {
                        if (array.getType(0) == ReadableType.String) {
                            ArrayList<Object> arrayList4 = array.toArrayList();
                            if (arrayList4 != null) {
                                arrayList3.addAll(C89206ad.m154682d(arrayList4));
                            } else {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        } else {
                            AbstractC28367a aVar2 = this.f45636d;
                            if (!(aVar2 == null || (f3 = aVar2.mo48557f()) == null || (string = f3.getString(i)) == null)) {
                                int size2 = array.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    String string2 = array.getMap(i2).getString(string);
                                    C89219l.m154709a((Object) string2, "");
                                    arrayList3.add(string2);
                                }
                            }
                        }
                    }
                    arrayList2.add(arrayList3);
                }
                AbstractC28367a aVar3 = this.f45634b;
                ArrayList<Object> arrayList5 = (aVar3 == null || (f2 = aVar3.mo48557f()) == null) ? null : f2.toArrayList();
                if (C89206ad.m154681c(arrayList5) && arrayList5 != null) {
                    ArrayList arrayList6 = new ArrayList(C89070n.m154526a((Iterable) arrayList5, 10));
                    Iterator<T> it = arrayList5.iterator();
                    while (it.hasNext()) {
                        arrayList6.add(Integer.valueOf((int) it.next().doubleValue()));
                    }
                    arrayList = arrayList6;
                }
                C19331c cVar = new C19331c(context);
                if (!(this.f45641i == null && this.f45642j == null && (fVar = this.f45651s) != null)) {
                    fVar = new C19315f(this);
                }
                C19331c b = ((C19331c) cVar.mo30793a(fVar).mo30795a(new C19316g(this)).mo30794a(new C19317h(this)).mo30780a(new C19318i(this))).mo30796a(arrayList2).mo30797b(arrayList);
                String str = this.f45643k;
                if (str != null) {
                    b.mo30779a(ColorUtils.m57910a(str));
                }
                String str2 = this.f45644l;
                if (str2 != null) {
                    b.mo30783b(ColorUtils.m57910a(str2));
                }
                String str3 = this.f45645m;
                if (str3 != null) {
                    b.mo30781a(str3);
                }
                String str4 = this.f45646n;
                if (str4 != null) {
                    b.mo30784c(ColorUtils.m57910a(str4));
                }
                String str5 = this.f45647o;
                if (str5 != null) {
                    b.mo30785d((int) C28930n.m57952a(str5));
                }
                b.mo30798b().mo30850a(this.mView);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$b */
    static final class View$OnClickListenerC19311b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45652a;

        /* renamed from: b */
        final /* synthetic */ Context f45653b;

        static {
            Covode.recordClassIndex(22099);
        }

        View$OnClickListenerC19311b(LynxPickerView lynxPickerView, Context context) {
            this.f45652a = lynxPickerView;
            this.f45653b = context;
        }

        public final void onClick(View view) {
            AbstractC19054a cVar;
            AbstractC19054a mVar;
            ReadableArray f;
            String e;
            AbstractC19054a jVar;
            String str = this.f45652a.f45633a;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            switch (str.hashCode()) {
                case -1364270024:
                    if (str.equals("multiSelector")) {
                        this.f45652a.mo30755a(this.f45653b);
                        return;
                    }
                    return;
                case 3076014:
                    if (str.equals("date")) {
                        LynxPickerView lynxPickerView = this.f45652a;
                        Context context = this.f45653b;
                        String str4 = lynxPickerView.f45637e;
                        String str5 = lynxPickerView.f45638f;
                        AbstractC28367a aVar = lynxPickerView.f45634b;
                        if (aVar != null) {
                            str2 = aVar.mo48556e();
                        }
                        String str6 = lynxPickerView.f45639g;
                        String str7 = lynxPickerView.f45640h;
                        C19330b bVar = new C19330b(context);
                        if (lynxPickerView.f45641i == null && lynxPickerView.f45642j == null && lynxPickerView.f45651s != null) {
                            cVar = lynxPickerView.f45651s;
                        } else {
                            cVar = new C19312c(lynxPickerView);
                        }
                        C19330b d = ((C19330b) bVar.mo30786a(cVar).mo30787a(new C19313d(lynxPickerView)).mo30780a(new C19314e(lynxPickerView))).mo30791c(str7).mo30789b(str6).mo30788a(str4, str5).mo30792d(str2);
                        String str8 = lynxPickerView.f45643k;
                        if (str8 != null) {
                            d.mo30779a(ColorUtils.m57910a(str8));
                        }
                        String str9 = lynxPickerView.f45644l;
                        if (str9 != null) {
                            d.mo30783b(ColorUtils.m57910a(str9));
                        }
                        String str10 = lynxPickerView.f45645m;
                        if (str10 != null) {
                            d.mo30781a(str10);
                        }
                        String str11 = lynxPickerView.f45646n;
                        if (str11 != null) {
                            d.mo30784c(ColorUtils.m57910a(str11));
                        }
                        String str12 = lynxPickerView.f45647o;
                        if (str12 != null) {
                            d.mo30785d((int) C28930n.m57952a(str12));
                        }
                        d.mo30790b().mo30850a(lynxPickerView.mView);
                        return;
                    }
                    return;
                case 3560141:
                    if (str.equals("time")) {
                        LynxPickerView lynxPickerView2 = this.f45652a;
                        Context context2 = this.f45653b;
                        String str13 = lynxPickerView2.f45637e;
                        String str14 = lynxPickerView2.f45638f;
                        AbstractC28367a aVar2 = lynxPickerView2.f45634b;
                        if (aVar2 != null) {
                            str3 = aVar2.mo48556e();
                        }
                        String str15 = lynxPickerView2.f45639g;
                        String str16 = lynxPickerView2.f45640h;
                        C19332d dVar = new C19332d(context2);
                        if (lynxPickerView2.f45641i == null && lynxPickerView2.f45642j == null && lynxPickerView2.f45651s != null) {
                            mVar = lynxPickerView2.f45651s;
                        } else {
                            mVar = new C19322m(lynxPickerView2);
                        }
                        C19332d d2 = ((C19332d) dVar.mo30799a(mVar).mo30800a(new C19323n(lynxPickerView2)).mo30780a(new C19324o(lynxPickerView2))).mo30804c(str16).mo30802b(str15).mo30801a(str13, str14).mo30805d(str3);
                        String str17 = lynxPickerView2.f45643k;
                        if (str17 != null) {
                            d2.mo30779a(ColorUtils.m57910a(str17));
                        }
                        String str18 = lynxPickerView2.f45644l;
                        if (str18 != null) {
                            d2.mo30783b(ColorUtils.m57910a(str18));
                        }
                        String str19 = lynxPickerView2.f45645m;
                        if (str19 != null) {
                            d2.mo30781a(str19);
                        }
                        String str20 = lynxPickerView2.f45646n;
                        if (str20 != null) {
                            d2.mo30784c(ColorUtils.m57910a(str20));
                        }
                        String str21 = lynxPickerView2.f45647o;
                        if (str21 != null) {
                            d2.mo30785d((int) C28930n.m57952a(str21));
                        }
                        d2.mo30803b().mo30850a(lynxPickerView2.mView);
                        return;
                    }
                    return;
                case 1191572447:
                    if (str.equals("selector")) {
                        LynxPickerView lynxPickerView3 = this.f45652a;
                        Context context3 = this.f45653b;
                        AbstractC28367a aVar3 = lynxPickerView3.f45635c;
                        if (!(aVar3 == null || aVar3.mo48559h() != ReadableType.Array || aVar3.mo48552a() || (f = aVar3.mo48557f()) == null || f.size() <= 0 || f.isNull(0))) {
                            ArrayList arrayList = new ArrayList();
                            if (f.getType(0) == ReadableType.String) {
                                ArrayList<Object> arrayList2 = f.toArrayList();
                                if (arrayList2 != null) {
                                    arrayList.addAll(arrayList2);
                                } else {
                                    throw new C89388w("null cannot be cast to non-null type");
                                }
                            } else {
                                AbstractC28367a aVar4 = lynxPickerView3.f45636d;
                                if (!(aVar4 == null || (e = aVar4.mo48556e()) == null)) {
                                    int size = f.size();
                                    for (int i = 0; i < size; i++) {
                                        String string = f.getMap(i).getString(e);
                                        C89219l.m154709a((Object) string, "");
                                        arrayList.add(string);
                                    }
                                }
                            }
                            AbstractC28367a aVar5 = lynxPickerView3.f45634b;
                            if (aVar5 != null) {
                                num = Integer.valueOf(aVar5.mo48555d());
                            }
                            C19331c cVar2 = new C19331c(context3);
                            if (lynxPickerView3.f45641i == null && lynxPickerView3.f45642j == null && lynxPickerView3.f45651s != null) {
                                jVar = lynxPickerView3.f45651s;
                            } else {
                                jVar = new C19319j(lynxPickerView3, arrayList, num);
                            }
                            cVar2.mo30793a(jVar);
                            cVar2.mo30795a(new C19320k(lynxPickerView3, arrayList, num));
                            cVar2.mo30780a(new C19321l(lynxPickerView3, arrayList, num));
                            cVar2.mo30796a(C89070n.m154524c(arrayList));
                            if (num != null) {
                                cVar2.mo30797b(C89070n.m154524c(Integer.valueOf(num.intValue())));
                            }
                            String str22 = lynxPickerView3.f45643k;
                            if (str22 != null) {
                                cVar2.mo30779a(ColorUtils.m57910a(str22));
                            }
                            String str23 = lynxPickerView3.f45644l;
                            if (str23 != null) {
                                cVar2.mo30783b(ColorUtils.m57910a(str23));
                            }
                            String str24 = lynxPickerView3.f45645m;
                            if (str24 != null) {
                                cVar2.mo30781a(str24);
                            }
                            String str25 = lynxPickerView3.f45646n;
                            if (str25 != null) {
                                cVar2.mo30784c(ColorUtils.m57910a(str25));
                            }
                            String str26 = lynxPickerView3.f45647o;
                            if (str26 != null) {
                                cVar2.mo30785d((int) C28930n.m57952a(str26));
                            }
                            cVar2.mo30798b().mo30850a(lynxPickerView3.mView);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$h */
    public static final class C19317h implements AbstractC19343g {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f45659a;

        static {
            Covode.recordClassIndex(22105);
        }

        C19317h(LynxPickerView lynxPickerView) {
            this.f45659a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19343g
        /* renamed from: a */
        public final void mo30775a(int i, Integer num) {
            if (this.f45659a.f45650r) {
                AbstractC28520j jVar = this.f45659a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f45659a.getSign(), "columnchange");
                cVar2.mo49838a("column", Integer.valueOf(i));
                cVar2.mo49838a("value", num);
                cVar.mo49834a(cVar2);
            }
        }
    }
}
