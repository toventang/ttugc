package com.lynx.tasm.p2062ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.AbstractC28392a;
import com.lynx.tasm.behavior.AbstractC28465b;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.image.AutoSizeImage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.ui.image.i */
public final class C28896i {
    static {
        Covode.recordClassIndex(35019);
    }

    /* renamed from: a */
    public static AbstractC28465b m57883a() {
        return new AbstractC28465b() {
            /* class com.lynx.tasm.p2062ui.image.C28896i.C288971 */

            static {
                Covode.recordClassIndex(35020);
            }

            @Override // com.lynx.tasm.behavior.AbstractC28465b
            /* renamed from: a */
            public final List<C28463a> mo33432a() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C28463a("image") {
                    /* class com.lynx.tasm.p2062ui.image.C28896i.C288971.C288981 */

                    static {
                        Covode.recordClassIndex(35021);
                    }

                    @Override // com.lynx.tasm.behavior.C28463a
                    /* renamed from: a */
                    public final ShadowNode mo16276a() {
                        return new AutoSizeImage();
                    }

                    @Override // com.lynx.tasm.behavior.C28463a
                    /* renamed from: b */
                    public final AbstractC28392a mo26076b() {
                        return new C28913m();
                    }

                    @Override // com.lynx.tasm.behavior.C28463a
                    /* renamed from: a */
                    public final LynxUI mo16275a(AbstractC28520j jVar) {
                        return new UIImage(jVar);
                    }

                    @Override // com.lynx.tasm.behavior.C28463a
                    /* renamed from: b */
                    public final LynxFlattenUI mo16278b(AbstractC28520j jVar) {
                        return new FlattenUIImage(jVar);
                    }
                });
                arrayList.add(new C28463a("filter-image") {
                    /* class com.lynx.tasm.p2062ui.image.C28896i.C288971.C288992 */

                    static {
                        Covode.recordClassIndex(35022);
                    }

                    @Override // com.lynx.tasm.behavior.C28463a
                    /* renamed from: a */
                    public final LynxUI mo16275a(AbstractC28520j jVar) {
                        return new UIFilterImage(jVar);
                    }
                });
                arrayList.add(new C28463a("inline-image") {
                    /* class com.lynx.tasm.p2062ui.image.C28896i.C288971.C289003 */

                    static {
                        Covode.recordClassIndex(35023);
                    }

                    @Override // com.lynx.tasm.behavior.C28463a
                    /* renamed from: a */
                    public final ShadowNode mo16276a() {
                        return new FrescoInlineImageShadowNode();
                    }
                });
                return arrayList;
            }
        };
    }
}
