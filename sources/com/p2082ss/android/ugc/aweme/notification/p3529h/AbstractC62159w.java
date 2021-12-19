package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e;
import com.p2082ss.android.ugc.aweme.story.avatar.EnumC76586o;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.w */
public abstract class AbstractC62159w extends C62129p {

    /* renamed from: s */
    public static final AbstractC76504c f141144s = C77260g.f173332a.mo120156d();

    /* renamed from: t */
    public static final AbstractC89244h f141145t = C89250i.m154773a((AbstractC89171a) C62161b.f141150a);

    /* renamed from: u */
    public static final C62160a f141146u = new C62160a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f141147a = C89250i.m154773a((AbstractC89171a) new C62165d(this));

    /* renamed from: q */
    public final StoryBrandView f141148q;

    /* renamed from: r */
    public EnumC62162c f141149r;

    /* renamed from: com.ss.android.ugc.aweme.notification.h.w$c */
    public static final class EnumC62162c extends Enum<EnumC62162c> {
        public static final EnumC62162c FOLLOW_REQUEST;
        public static final EnumC62162c INBOX;

        /* renamed from: a */
        private static final /* synthetic */ EnumC62162c[] f141151a;

        static {
            Covode.recordClassIndex(72916);
            C62164b bVar = new C62164b("INBOX");
            INBOX = bVar;
            C62163a aVar = new C62163a("FOLLOW_REQUEST");
            FOLLOW_REQUEST = aVar;
            f141151a = new EnumC62162c[]{bVar, aVar};
        }

        public static EnumC62162c valueOf(String str) {
            return (EnumC62162c) Enum.valueOf(EnumC62162c.class, str);
        }

        public static EnumC62162c[] values() {
            return (EnumC62162c[]) f141151a.clone();
        }

        public abstract String getEnterFrom();

        /* renamed from: com.ss.android.ugc.aweme.notification.h.w$c$a */
        static final class C62163a extends EnumC62162c {

            /* renamed from: a */
            private final String f141152a = "follow_request";

            static {
                Covode.recordClassIndex(72917);
            }

            @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w.EnumC62162c
            public final String getEnterFrom() {
                return this.f141152a;
            }

            C62163a(String str) {
                super(str, 1, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.h.w$c$b */
        static final class C62164b extends EnumC62162c {

            /* renamed from: a */
            private final String f141153a = "notification_page";

            static {
                Covode.recordClassIndex(72918);
            }

            @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w.EnumC62162c
            public final String getEnterFrom() {
                return this.f141153a;
            }

            C62164b(String str) {
                super(str, 0, null);
            }
        }

        private EnumC62162c(String str, int i) {
            super(str, i);
        }

        public /* synthetic */ EnumC62162c(String str, int i, C89214g gVar) {
            this(str, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract User mo100067c();

    /* renamed from: com.ss.android.ugc.aweme.notification.h.w$a */
    public static final class C62160a {
        static {
            Covode.recordClassIndex(72914);
        }

        /* renamed from: a */
        public static Map<EnumC62162c, Set<String>> m112408a() {
            return (Map) AbstractC62159w.f141145t.getValue();
        }

        private C62160a() {
        }

        public /* synthetic */ C62160a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m112409a(EnumC62162c cVar) {
            C89219l.m154721d(cVar, "");
            AbstractC76504c cVar2 = AbstractC62159w.f141144s;
            if (cVar2 != null && cVar2.mo120232a()) {
                m112408a().put(cVar, new LinkedHashSet());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.w$b */
    static final class C62161b extends AbstractC89220m implements AbstractC89171a<Map<EnumC62162c, Set<String>>> {

        /* renamed from: a */
        public static final C62161b f141150a = new C62161b();

        static {
            Covode.recordClassIndex(72915);
        }

        C62161b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<EnumC62162c, Set<String>> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(72913);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.w$d */
    public static final class C62165d extends AbstractC89220m implements AbstractC89171a<AbstractC76506d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC62159w f141154a;

        static {
            Covode.recordClassIndex(72919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62165d(AbstractC62159w wVar) {
            super(0);
            this.f141154a = wVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76506d invoke() {
            AbstractC76504c d;
            Context context = this.f141154a.f140983i;
            if (!(context instanceof ActivityC0218d)) {
                context = null;
            }
            final ActivityC0218d dVar = (ActivityC0218d) context;
            if (dVar == null || (d = C77260g.f173332a.mo120156d()) == null) {
                return null;
            }
            return d.mo120228a(new AbstractC76508e(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w.C62165d.C621661 */

                /* renamed from: a */
                final /* synthetic */ C62165d f141155a;

                static {
                    Covode.recordClassIndex(72920);
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                /* renamed from: d */
                public final boolean mo80540d() {
                    return true;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: b */
                public final /* bridge */ /* synthetic */ AbstractC1204m mo80538b() {
                    return dVar;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: c */
                public final EnumC76586o mo80539c() {
                    return EnumC76586o.INBOX;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: a */
                public final StoryBrandView mo80534a() {
                    return this.f141155a.f141154a.f141148q;
                }

                {
                    this.f141155a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                /* renamed from: a */
                public final void mo80536a(boolean z, EnumC79475a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC76508e.C76509a.m134112a(aVar);
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                /* renamed from: a */
                public final void mo80535a(SmartRoute smartRoute, Aweme aweme) {
                    String str;
                    C89219l.m154721d(smartRoute, "");
                    C89219l.m154721d(aweme, "");
                    EnumC62162c cVar = this.f141155a.f141154a.f141149r;
                    if (cVar != null) {
                        str = cVar.getEnterFrom();
                    } else {
                        str = null;
                    }
                    smartRoute.withParam("enter_from", str);
                }

                @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76547g
                /* renamed from: a */
                public final boolean mo80537a(String str, HashMap<String, String> hashMap) {
                    String str2;
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(hashMap, "");
                    EnumC62162c cVar = this.f141155a.f141154a.f141149r;
                    if (cVar == null) {
                        return false;
                    }
                    if (C89219l.m154714a((Object) str, (Object) "story_show")) {
                        AbstractC62159w wVar = this.f141155a.f141154a;
                        BaseNotice baseNotice = wVar.f140984j;
                        if (baseNotice == null || (str2 = baseNotice.nid) == null) {
                            str2 = String.valueOf(wVar.getAdapterPosition());
                        }
                        Set<String> set = C62160a.m112408a().get(cVar);
                        if (set == null || set.contains(str2)) {
                            return false;
                        }
                        set.add(str2);
                    }
                    hashMap.put("enter_from", cVar.getEnterFrom());
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo100164a(EnumC62162c cVar) {
        C89219l.m154721d(cVar, "");
        this.f141149r = cVar;
    }

    /* renamed from: a */
    public final void mo100165a(boolean z) {
        User user;
        if (z) {
            user = mo100067c();
        } else {
            user = null;
        }
        AbstractC76506d dVar = (AbstractC76506d) this.f141147a.getValue();
        if (dVar != null) {
            dVar.mo120241a(user, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC62159w(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cui);
        C89219l.m154716b(findViewById, "");
        this.f141148q = (StoryBrandView) findViewById;
    }
}
