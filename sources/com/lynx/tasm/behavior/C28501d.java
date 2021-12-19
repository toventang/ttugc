package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.list.UIList;
import com.lynx.tasm.behavior.p2052ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.p2052ui.text.FlattenUIText;
import com.lynx.tasm.behavior.p2052ui.text.UIText;
import com.lynx.tasm.behavior.p2052ui.view.UIComponent;
import com.lynx.tasm.behavior.p2052ui.view.UIView;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.d */
public class C28501d implements AbstractC28465b {
    static {
        Covode.recordClassIndex(34499);
    }

    @Override // com.lynx.tasm.behavior.AbstractC28465b
    /* renamed from: a */
    public final List<C28463a> mo33432a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C28463a("view") {
            /* class com.lynx.tasm.behavior.C28501d.C285021 */

            static {
                Covode.recordClassIndex(34500);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final LynxUI mo16275a(AbstractC28520j jVar) {
                return new UIView(jVar);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: b */
            public final LynxFlattenUI mo16278b(AbstractC28520j jVar) {
                return new LynxFlattenUI(jVar);
            }
        });
        arrayList.add(new C28463a("text") {
            /* class com.lynx.tasm.behavior.C28501d.C285032 */

            static {
                Covode.recordClassIndex(34501);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final ShadowNode mo16276a() {
                return new TextShadowNode();
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: b */
            public final LynxFlattenUI mo16278b(AbstractC28520j jVar) {
                return new FlattenUIText(jVar);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final LynxUI mo16275a(AbstractC28520j jVar) {
                return new UIText(jVar);
            }
        });
        arrayList.add(new C28463a("raw-text") {
            /* class com.lynx.tasm.behavior.C28501d.C285043 */

            static {
                Covode.recordClassIndex(34502);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final ShadowNode mo16276a() {
                return new RawTextShadowNode();
            }
        });
        arrayList.add(new C28463a("inline-text") {
            /* class com.lynx.tasm.behavior.C28501d.C285054 */

            static {
                Covode.recordClassIndex(34503);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final ShadowNode mo16276a() {
                return new InlineTextShadowNode();
            }
        });
        arrayList.add(new C28463a("scroll-view") {
            /* class com.lynx.tasm.behavior.C28501d.C285065 */

            static {
                Covode.recordClassIndex(34504);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final LynxUI mo16275a(AbstractC28520j jVar) {
                return new UIScrollView(jVar);
            }
        });
        arrayList.add(new C28463a("component") {
            /* class com.lynx.tasm.behavior.C28501d.C285076 */

            static {
                Covode.recordClassIndex(34505);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final LynxUI mo16275a(AbstractC28520j jVar) {
                return new UIComponent(jVar);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: b */
            public final LynxFlattenUI mo16278b(AbstractC28520j jVar) {
                return new LynxFlattenUI(jVar);
            }
        });
        arrayList.add(new C28463a("list") {
            /* class com.lynx.tasm.behavior.C28501d.C285087 */

            static {
                Covode.recordClassIndex(34506);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final LynxUI mo16275a(AbstractC28520j jVar) {
                return new UIList(jVar);
            }
        });
        return arrayList;
    }
}
