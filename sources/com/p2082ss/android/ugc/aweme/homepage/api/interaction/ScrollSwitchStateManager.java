package com.p2082ss.android.ugc.aweme.homepage.api.interaction;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager */
public class ScrollSwitchStateManager extends BaseScrollSwitchStateManager {

    /* renamed from: p */
    public static final C52950a f121779p = new C52950a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager$a */
    public static final class C52950a {
        static {
            Covode.recordClassIndex(62477);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager$a$a */
        public static final class C52951a implements C1175ad.AbstractC1177b {
            static {
                Covode.recordClassIndex(62478);
            }

            C52951a() {
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                return new ScrollSwitchStateManager();
            }
        }

        private C52950a() {
        }

        public /* synthetic */ C52950a(byte b) {
            this();
        }

        /* renamed from: a */
        public static ScrollSwitchStateManager m97811a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, new C52951a()).mo3983a(ScrollSwitchStateManager.class);
            C89219l.m154716b(a, "");
            return (ScrollSwitchStateManager) a;
        }
    }

    static {
        Covode.recordClassIndex(62476);
    }

    /* renamed from: c */
    public final Fragment mo89361c() {
        if (this.f121769k == null) {
            return null;
        }
        WeakReference<Fragment> weakReference = this.f121769k;
        if (weakReference == null) {
            C89219l.m154715b();
        }
        return weakReference.get();
    }
}
