package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.core.p037h.C0769d;
import androidx.customview.p040a.C0827a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.reveal.C19408a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public class LynxRevealView extends UISimpleView<C19408a> {

    /* renamed from: b */
    public static final C19406a f45973b = new C19406a((byte) 0);

    /* renamed from: a */
    public boolean f45974a;

    /* renamed from: c */
    private C19408a f45975c;

    static {
        Covode.recordClassIndex(22213);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    /* renamed from: com.bytedance.ies.xelement.reveal.LynxRevealView$a */
    public static final class C19406a {
        static {
            Covode.recordClassIndex(22216);
        }

        private C19406a() {
        }

        public /* synthetic */ C19406a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.reveal.LynxRevealView$b */
    public static final class C19407b implements C19408a.AbstractC19410b {

        /* renamed from: a */
        final /* synthetic */ LynxRevealView f45976a;

        static {
            Covode.recordClassIndex(22217);
        }

        @Override // com.bytedance.ies.xelement.reveal.C19408a.AbstractC19410b
        /* renamed from: a */
        public final void mo30959a() {
            if (this.f45976a.f45974a) {
                AbstractC28520j jVar = this.f45976a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f45976a.getSign(), "state");
                cVar2.mo49838a("state", "closed");
                cVar.mo49834a(cVar2);
            }
        }

        @Override // com.bytedance.ies.xelement.reveal.C19408a.AbstractC19410b
        /* renamed from: b */
        public final void mo30960b() {
            if (this.f45976a.f45974a) {
                AbstractC28520j jVar = this.f45976a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f45976a.getSign(), "state");
                cVar2.mo49838a("state", "opened");
                cVar.mo49834a(cVar2);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19407b(LynxRevealView lynxRevealView) {
            this.f45976a = lynxRevealView;
        }
    }

    public LynxRevealView(AbstractC28520j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null && map.containsKey("state")) {
            this.f45974a = true;
        }
    }

    @AbstractC28525m(mo49059a = "mode", mo49063e = 0)
    public final void setRevealLayoutMode(String str) {
        C89219l.m154719c(str, "");
        Locale locale = Locale.ROOT;
        C89219l.m154709a((Object) locale, "");
        String lowerCase = str.toLowerCase(locale);
        C89219l.m154709a((Object) lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1394648469) {
            if (hashCode == -1039745817 && lowerCase.equals("normal")) {
                C19408a aVar = this.f45975c;
                if (aVar == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                aVar.setMode$x_element_reveal_view_release(0);
            }
        } else if (lowerCase.equals("same_level")) {
            C19408a aVar2 = this.f45975c;
            if (aVar2 == null) {
                C89219l.m154710a("mRevealLayout");
            }
            aVar2.setMode$x_element_reveal_view_release(1);
        }
    }

    @AbstractC28528p
    public final void toggleActive(ReadableMap readableMap) {
        C89219l.m154719c(readableMap, "");
        if (readableMap.hasKey("state")) {
            String string = readableMap.getString("state");
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != 3417674) {
                    if (hashCode == 94756344 && string.equals("close")) {
                        C19408a aVar = this.f45975c;
                        if (aVar == null) {
                            C89219l.m154710a("mRevealLayout");
                        }
                        aVar.mo30964b(true);
                    }
                } else if (string.equals("open")) {
                    C19408a aVar2 = this.f45975c;
                    if (aVar2 == null) {
                        C89219l.m154710a("mRevealLayout");
                    }
                    aVar2.mo30963a(true);
                }
            }
        } else {
            C19408a aVar3 = this.f45975c;
            if (aVar3 == null) {
                C89219l.m154710a("mRevealLayout");
            }
            if (aVar3.f45988j == 2) {
                C19408a aVar4 = this.f45975c;
                if (aVar4 == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                aVar4.mo30964b(true);
                return;
            }
            C19408a aVar5 = this.f45975c;
            if (aVar5 == null) {
                C89219l.m154710a("mRevealLayout");
            }
            aVar5.mo30963a(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C19408a createView(Context context) {
        Class<?> cls;
        Field declaredField;
        if (context == null) {
            return null;
        }
        C19408a aVar = new C19408a(context);
        this.f45975c = aVar;
        aVar.f45992n = 2;
        aVar.f45987i = 300;
        aVar.f45989k = 1;
        Context context2 = aVar.getContext();
        C89219l.m154709a((Object) context2, "");
        C89219l.m154719c(context2, "");
        Resources resources = context2.getResources();
        C89219l.m154709a((Object) resources, "");
        aVar.f45983e = (int) ((resources.getDisplayMetrics().density * 1.0f) + 0.5f);
        aVar.f45993o = C0827a.m2923a(aVar, 1.0f, aVar.f45996r);
        try {
            C0827a aVar2 = aVar.f45993o;
            if (!(aVar2 == null || (cls = aVar2.getClass()) == null || (declaredField = cls.getDeclaredField("mScroller")) == null)) {
                declaredField.setAccessible(true);
                declaredField.set(aVar.f45993o, new C19415b(aVar.getContext(), new C19408a.animationInterpolatorC19411c()));
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        C0827a aVar3 = aVar.f45993o;
        if (aVar3 != null) {
            aVar3.f3074j = 15;
        }
        aVar.f45994p = new C0769d(aVar.getContext(), aVar.f45997s);
        C19408a aVar4 = this.f45975c;
        if (aVar4 == null) {
            C89219l.m154710a("mRevealLayout");
        }
        aVar4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C19408a aVar5 = this.f45975c;
        if (aVar5 == null) {
            C89219l.m154710a("mRevealLayout");
        }
        aVar5.setSwipeListener(new C19407b(this));
        C19408a aVar6 = this.f45975c;
        if (aVar6 == null) {
            C89219l.m154710a("mRevealLayout");
        }
        return aVar6;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i, lynxBaseUI);
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(this);
            if (lynxBaseUI instanceof LynxRevealInnerLeft) {
                C19408a aVar = this.f45975c;
                if (aVar == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                C28698a aVar2 = (C28698a) ((LynxUI) lynxBaseUI).mView;
                C89219l.m154709a((Object) aVar2, "");
                aVar.mo30962a(aVar2);
                C19408a aVar3 = this.f45975c;
                if (aVar3 == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                aVar3.setDragEdge(1);
            } else if (lynxBaseUI instanceof LynxRevealInnerRight) {
                C19408a aVar4 = this.f45975c;
                if (aVar4 == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                C28698a aVar5 = (C28698a) ((LynxUI) lynxBaseUI).mView;
                C89219l.m154709a((Object) aVar5, "");
                aVar4.mo30962a(aVar5);
                C19408a aVar6 = this.f45975c;
                if (aVar6 == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                aVar6.setDragEdge(2);
            } else if (lynxBaseUI instanceof LynxRevealInnerTop) {
                C19408a aVar7 = this.f45975c;
                if (aVar7 == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                C28698a aVar8 = (C28698a) ((LynxUI) lynxBaseUI).mView;
                C89219l.m154709a((Object) aVar8, "");
                aVar7.mo30962a(aVar8);
                C19408a aVar9 = this.f45975c;
                if (aVar9 == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                aVar9.setDragEdge(4);
            } else if (lynxBaseUI instanceof LynxRevealInnerBottom) {
                C19408a aVar10 = this.f45975c;
                if (aVar10 == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                C28698a aVar11 = (C28698a) ((LynxUI) lynxBaseUI).mView;
                C89219l.m154709a((Object) aVar11, "");
                aVar10.mo30962a(aVar11);
                C19408a aVar12 = this.f45975c;
                if (aVar12 == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                aVar12.setDragEdge(8);
            } else {
                C19408a aVar13 = this.f45975c;
                if (aVar13 == null) {
                    C89219l.m154710a("mRevealLayout");
                }
                T t = lynxUI.mView;
                C89219l.m154709a((Object) t, "");
                C89219l.m154719c(t, "");
                if (aVar13.f45979a != null) {
                    aVar13.removeView(aVar13.f45979a);
                }
                aVar13.f45979a = t;
                aVar13.addView(t);
            }
        }
    }
}
