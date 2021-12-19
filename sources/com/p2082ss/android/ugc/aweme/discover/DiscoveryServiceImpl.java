package com.p2082ss.android.ugc.aweme.discover;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C27917g;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41941b;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41944d;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42875m;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42909a;
import com.p2082ss.android.ugc.aweme.discover.repo.gson.TrendingTopicListTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.lang.reflect.Type;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.discover.DiscoveryServiceImpl */
public final class DiscoveryServiceImpl implements IDiscoveryService {
    static {
        Covode.recordClassIndex(49386);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: a */
    public final boolean mo70761a(Aweme aweme, int i) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: a */
    public final boolean mo70762a(User user, int i) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.DiscoveryServiceImpl$a */
    public static final class C41483a extends C27895a<TrendingTopicList> {
        static {
            Covode.recordClassIndex(49387);
        }

        C41483a() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: b */
    public final AbstractC41892c mo70763b() {
        return C42909a.f100057b;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: a */
    public final Fragment mo70759a() {
        return new C42875m();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: c */
    public final List<Type> mo70764c() {
        return C89070n.m154516a(new C41483a().type);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: d */
    public final String mo70765d() {
        String a = C58071d.m104907a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: e */
    public final boolean mo70766e() {
        if (C41944d.m83983a() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: f */
    public final boolean mo70767f() {
        if (C41944d.m83983a() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static IDiscoveryService m83414g() {
        MethodCollector.m26663i(8239);
        Object a = C81908b.m141854a(IDiscoveryService.class, false);
        if (a != null) {
            IDiscoveryService iDiscoveryService = (IDiscoveryService) a;
            MethodCollector.m26664o(8239);
            return iDiscoveryService;
        }
        if (C81908b.f183170aZ == null) {
            synchronized (IDiscoveryService.class) {
                try {
                    if (C81908b.f183170aZ == null) {
                        C81908b.f183170aZ = new DiscoveryServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8239);
                    throw th;
                }
            }
        }
        DiscoveryServiceImpl discoveryServiceImpl = (DiscoveryServiceImpl) C81908b.f183170aZ;
        MethodCollector.m26664o(8239);
        return discoveryServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: a */
    public final C27917g mo70760a(C27917g gVar) {
        C89219l.m154721d(gVar, "");
        if (C41941b.m83980b()) {
            int b = C84912r.m145933b(C17867d.m33078a());
            Resources system = Resources.getSystem();
            C89219l.m154716b(system, "");
            int a = b - C89241a.m154730a(TypedValue.applyDimension(1, 275.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154716b(system2, "");
            gVar.mo46679a(new TrendingTopicListTypeAdapterFactory((a / C89241a.m154730a(TypedValue.applyDimension(1, 165.0f, system2.getDisplayMetrics()))) + 1));
        }
        return gVar;
    }
}
