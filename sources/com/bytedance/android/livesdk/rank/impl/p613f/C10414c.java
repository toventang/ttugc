package com.bytedance.android.livesdk.rank.impl.p613f;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.p514d.C8313a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.rank.api.model.C10348b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.rank.impl.f.c */
public final class C10414c {

    /* renamed from: com.bytedance.android.livesdk.rank.impl.f.c$a */
    public interface AbstractC10415a {
        static {
            Covode.recordClassIndex(11989);
        }

        /* renamed from: a */
        void mo17283a();

        /* renamed from: b */
        void mo17284b();

        /* renamed from: c */
        C10348b mo17285c();
    }

    static {
        Covode.recordClassIndex(11988);
    }

    /* renamed from: a */
    public static boolean m18933a() {
        try {
            if (((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)).getOwnerUserId() == C11115u.m19743a().mo17915b().mo13161c()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m18934a(C10348b bVar) {
        try {
            if (C11115u.m19743a().mo17915b().mo13161c() == bVar.f25001a.getId()) {
                return true;
            }
            return bVar.f25001a.isFollowing();
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static void m18929a(long j) {
        try {
            long id = ((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)).getId();
            if (id != 0) {
                C11115u.m19743a().mo17915b().mo13150a(((C6865d.AbstractC6866a) new C6865d.C6867b().mo13134a(j)).mo13138b(id).mo13141c()).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C10416d.f25129a, C10417e.f25130a);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m18932a(AbstractC10415a aVar) {
        C6779a.m14563a().mo13052a(C11625a.class).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143268a(C10418f.f25131a).mo143268a(new C10419g(aVar)).mo143268a(C10420h.f25133a).mo143268a(new C10421i(aVar)).mo143254a(new C10422j(aVar), C10423k.f25136a);
    }

    /* renamed from: a */
    public static void m18930a(HSImageView hSImageView, ImageView imageView, C10348b bVar) {
        if (hSImageView != null && imageView != null && bVar != null) {
            ImageModel b = C8313a.m16464b(bVar.f25001a);
            if (b != null) {
                hSImageView.setVisibility(0);
                C3941k.m9601a(hSImageView, b);
            } else {
                hSImageView.setVisibility(8);
            }
            C7577g.m15571a(imageView, bVar.f25001a.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), 2131234441);
        }
    }

    /* renamed from: a */
    public static void m18931a(LiveTextView liveTextView, C10348b bVar, Boolean bool) {
        if (liveTextView != null && bVar != null) {
            if (bVar.f25003c > 0 || !bool.booleanValue()) {
                int i = bVar.f25002b;
                if (i == 1) {
                    liveTextView.setTextColor(C3966y.m9663b((int) R.color.uw));
                } else if (i == 2) {
                    liveTextView.setTextColor(C3966y.m9663b((int) R.color.ux));
                } else if (i != 3) {
                    liveTextView.setTextColor(C3966y.m9663b((int) R.color.uv));
                } else {
                    liveTextView.setTextColor(C3966y.m9663b((int) R.color.uy));
                }
                liveTextView.setText(String.valueOf(bVar.f25002b));
                return;
            }
            liveTextView.setText("-");
            liveTextView.setTextColor(C3966y.m9663b((int) R.color.uv));
        }
    }
}
