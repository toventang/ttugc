package com.bytedance.ies.xelement.pickview;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.view.UIView;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxPickView extends UIView {

    /* renamed from: a */
    public String f45880a;

    /* renamed from: b */
    public String f45881b;

    /* renamed from: c */
    public String f45882c;

    static {
        Covode.recordClassIndex(22165);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.view.UIView
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            if (hashCode != -208291852) {
                if (hashCode != 1256871824) {
                    if (hashCode == 2065426547 && nextKey.equals("indicator-style")) {
                        setIndicatorStyle(readableMap.getString(nextKey));
                    }
                } else if (nextKey.equals("mask-style")) {
                    setMaskStyle(readableMap.getString(nextKey));
                }
            } else if (nextKey.equals("visible-count")) {
                setVisibleCount(readableMap.getString(nextKey));
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void measureChildren() {
        List list;
        List list2;
        List list3;
        String str = this.f45880a;
        if (!(str == null || (list3 = this.mChildren) == null)) {
            for (LynxPickerViewColumn lynxPickerViewColumn : C89070n.m154544a((Iterable<?>) list3, LynxPickerViewColumn.class)) {
                lynxPickerViewColumn.setIndicatorStyle(str);
            }
        }
        String str2 = this.f45881b;
        if (!(str2 == null || (list2 = this.mChildren) == null)) {
            for (LynxPickerViewColumn lynxPickerViewColumn2 : C89070n.m154544a((Iterable<?>) list2, LynxPickerViewColumn.class)) {
                lynxPickerViewColumn2.setMaskStyle(str2);
            }
        }
        String str3 = this.f45882c;
        if (!(str3 == null || (list = this.mChildren) == null)) {
            for (LynxPickerViewColumn lynxPickerViewColumn3 : C89070n.m154544a((Iterable<?>) list, LynxPickerViewColumn.class)) {
                lynxPickerViewColumn3.setVisibleCount(str3);
            }
        }
        super.measureChildren();
    }

    @AbstractC28525m(mo49059a = "indicator-style")
    public final void setIndicatorStyle(String str) {
        C89219l.m154719c(str, "");
        this.f45880a = str;
    }

    @AbstractC28525m(mo49059a = "mask-style")
    public final void setMaskStyle(String str) {
        C89219l.m154719c(str, "");
        this.f45881b = str;
    }

    @AbstractC28525m(mo49059a = "visible-count")
    public final void setVisibleCount(String str) {
        C89219l.m154719c(str, "");
        this.f45882c = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxPickView(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
    }
}
