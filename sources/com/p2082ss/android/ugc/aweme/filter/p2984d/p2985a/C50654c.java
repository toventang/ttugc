package com.p2082ss.android.ugc.aweme.filter.p2984d.p2985a;

import android.app.Application;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.filter.C50685e;
import com.p2082ss.android.ugc.aweme.filter.p2982b.C50646a;
import com.p2082ss.android.ugc.aweme.filter.p2982b.C50647b;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50683b;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50684c;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox.C50730c;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox.C50732d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50753a;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50755b;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50759d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50782h;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50702j;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50708p;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.tools.p4081a.C77805a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84455l;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84907n;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.filter.d.a.c */
public class C50654c implements AbstractC50651a {

    /* renamed from: a */
    final AbstractC89244h f116992a = C89250i.m154773a((AbstractC89171a) new C50668e(this));

    /* renamed from: b */
    private final AbstractC89244h f116993b = C89250i.m154773a((AbstractC89171a) C50665b.f117009a);

    /* renamed from: c */
    private final AbstractC89244h f116994c = C89250i.m154773a((AbstractC89171a) new C50666c(this));

    /* renamed from: d */
    private final AbstractC89244h f116995d = C89250i.m154773a((AbstractC89171a) new C50667d(this));

    /* renamed from: e */
    private final AbstractC89244h f116996e = C89250i.m154773a((AbstractC89171a) new C50655a(this));

    /* renamed from: f */
    private final AbstractC27255q<String> f116997f = C50677f.f117021a;

    /* renamed from: g */
    private AbstractC46415f f116998g;

    static {
        Covode.recordClassIndex(59816);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a
    /* renamed from: b */
    public final AbstractC50683b mo86004b() {
        return (AbstractC50683b) this.f116993b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a
    /* renamed from: c */
    public AbstractC50684c mo86005c() {
        return (AbstractC50684c) this.f116994c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a
    /* renamed from: d */
    public final AbstractC50707o mo86006d() {
        return (AbstractC50707o) this.f116995d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a
    /* renamed from: f */
    public final AbstractC50702j mo86008f() {
        return (AbstractC50702j) this.f116996e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a
    /* renamed from: a */
    public final void mo86003a() {
        C84907n.m145913a();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a
    /* renamed from: h */
    public AbstractC27255q<String> mo86010h() {
        return this.f116997f;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a */
    static final class C50655a extends AbstractC89220m implements AbstractC89171a<C50730c> {

        /* renamed from: a */
        final /* synthetic */ C50654c f116999a;

        static {
            Covode.recordClassIndex(59817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50655a(C50654c cVar) {
            super(0);
            this.f116999a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$b */
        static final class C50658b<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50658b f117002a = new C50658b();

            static {
                Covode.recordClassIndex(59820);
            }

            C50658b() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                return AppLog.getServerDeviceId();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$c */
        static final class C50659c<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50659c f117003a = new C50659c();

            static {
                Covode.recordClassIndex(59821);
            }

            C50659c() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                return EffectPlatform.m89510a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$g */
        static final class C50663g<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50663g f117007a = new C50663g();

            static {
                Covode.recordClassIndex(59825);
            }

            C50663g() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Object mo5560b() {
                return EffectPlatform.m89511b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$d */
        static final class C50660d<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50660d f117004a = new C50660d();

            static {
                Covode.recordClassIndex(59822);
            }

            C50660d() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                return C63244g.m114602a().mo73297y().mo93847a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$e */
        static final class C50661e<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50661e f117005a = new C50661e();

            static {
                Covode.recordClassIndex(59823);
            }

            C50661e() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                return C63244g.m114602a().mo73295w().mo93780i();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$f */
        static final class C50662f<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50662f f117006a = new C50662f();

            static {
                Covode.recordClassIndex(59824);
            }

            C50662f() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                return C63244g.m114602a().mo73278f().mo73333b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$h */
        static final class C50664h<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50664h f117008a = new C50664h();

            static {
                Covode.recordClassIndex(59826);
            }

            C50664h() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                return C63244g.m114602a().mo73278f().mo73332a();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C50730c invoke() {
            return new C50730c(this.f116999a.mo86006d(), C50657a.f117001a, new AbstractC27255q(this) {
                /* class com.p2082ss.android.ugc.aweme.filter.p2984d.p2985a.C50654c.C50655a.C506561 */

                /* renamed from: a */
                final /* synthetic */ C50655a f117000a;

                static {
                    Covode.recordClassIndex(59818);
                }

                {
                    this.f117000a = r1;
                }

                @Override // com.google.p1998c.p1999a.AbstractC27255q
                /* renamed from: b */
                public final /* synthetic */ Object mo5560b() {
                    return this.f117000a.f116999a.mo86007e();
                }
            }, new C50732d(C50658b.f117002a, C50659c.f117003a, C50660d.f117004a, C50661e.f117005a, this.f116999a.mo86010h(), C50662f.f117006a, C50663g.f117007a, C50664h.f117008a));
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$a$a */
        static final class C50657a<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50657a f117001a = new C50657a();

            static {
                Covode.recordClassIndex(59819);
            }

            C50657a() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                String itemName = EffectPlatformFactory.m89604a().getHosts().get(0).getItemName();
                AbstractC63196au C = C63244g.m114602a().mo73257C();
                C89219l.m154716b(itemName, "");
                if (!C89361p.m154906a((CharSequence) itemName, '/')) {
                    itemName = itemName + '/';
                }
                C89219l.m154716b(itemName, "");
                return C.retrofitCreate(itemName, FilterBoxApi.class);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e */
    static final class C50668e extends AbstractC89220m implements AbstractC89171a<C50782h> {

        /* renamed from: a */
        final /* synthetic */ C50654c f117012a;

        static {
            Covode.recordClassIndex(59830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50668e(C50654c cVar) {
            super(0);
            this.f117012a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$c */
        static final class C50673c<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50673c f117017a = new C50673c();

            static {
                Covode.recordClassIndex(59835);
            }

            C50673c() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                return new C50685e();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$e */
        static final class C50676e<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50676e f117020a = new C50676e();

            static {
                Covode.recordClassIndex(59838);
            }

            C50676e() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                return new C50680f();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$d */
        public static final class C50674d implements AbstractC27255q<AbstractC84455l> {

            /* renamed from: a */
            private final AbstractC89244h f117018a = C89250i.m154773a((AbstractC89171a) C50675a.f117019a);

            static {
                Covode.recordClassIndex(59836);
            }

            /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$d$a */
            static final class C50675a extends AbstractC89220m implements AbstractC89171a<C77805a> {

                /* renamed from: a */
                public static final C50675a f117019a = new C50675a();

                static {
                    Covode.recordClassIndex(59837);
                }

                C50675a() {
                    super(0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C77805a invoke() {
                    Application application = C63247i.f143610a;
                    C89219l.m154716b(application, "");
                    return new C77805a(application);
                }
            }

            C50674d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ AbstractC84455l mo5560b() {
                return (C77805a) this.f117018a.getValue();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$b */
        static final class C50672b<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50672b f117016a = new C50672b();

            static {
                Covode.recordClassIndex(59834);
            }

            C50672b() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                String absolutePath = new File(C84902i.m145895b(C63247i.f143610a), "filters").getAbsolutePath();
                C89219l.m154716b(absolutePath, "");
                return new C50652a(new C50759d(absolutePath));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$a */
        static final class C50670a<T> implements AbstractC27255q {

            /* renamed from: a */
            public static final C50670a f117014a = new C50670a();

            static {
                Covode.recordClassIndex(59832);
            }

            C50670a() {
            }

            @Override // com.google.p1998c.p1999a.AbstractC27255q
            /* renamed from: b */
            public final /* synthetic */ Object mo5560b() {
                String str = C70638dj.f158113p;
                int h = C63244g.m114602a().mo73295w().mo93779h();
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService();
                List a = C89070n.m154516a(C89387v.m154943a(new int[]{R.raw.filters}, C70637di.f158101d));
                C50671a aVar = C50671a.f117015a;
                C14401a aVar2 = new C14401a();
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                AndroidResourceFilterBackupPreferences androidResourceFilterBackupPreferences = (AndroidResourceFilterBackupPreferences) aVar2.mo23215a(application, AndroidResourceFilterBackupPreferences.class);
                if (C50647b.m94905a()) {
                    Application application2 = C63247i.f143610a;
                    C89219l.m154716b(application2, "");
                    C89219l.m154716b(str, "");
                    return new C50653b(application2, str, h, a, aVar, androidResourceFilterBackupPreferences);
                }
                Application application3 = C63247i.f143610a;
                C89219l.m154716b(application3, "");
                C89219l.m154716b(str, "");
                return new C50753a(application3, str, h, a, aVar, androidResourceFilterBackupPreferences);
            }

            /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$e$a$a */
            static final class C50671a<T> implements AbstractC27255q {

                /* renamed from: a */
                public static final C50671a f117015a = new C50671a();

                static {
                    Covode.recordClassIndex(59833);
                }

                C50671a() {
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.util.ArrayList */
                /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.util.ArrayList */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.p1998c.p1999a.AbstractC27255q
                /* renamed from: b */
                public final /* synthetic */ Object mo5560b() {
                    Application application = C63247i.f143610a;
                    C89219l.m154716b(application, "");
                    Resources resources = application.getResources();
                    String[] stringArray = resources.getStringArray(R.array.an);
                    C89219l.m154716b(stringArray, "");
                    String[] stringArray2 = resources.getStringArray(R.array.am);
                    C89219l.m154716b(stringArray2, "");
                    TypedArray obtainTypedArray = resources.obtainTypedArray(R.array.ao);
                    C89219l.m154716b(obtainTypedArray, "");
                    ArrayList arrayList = new ArrayList(stringArray.length);
                    int length = stringArray.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        arrayList.add(Integer.valueOf(obtainTypedArray.getResourceId(i2, 0)));
                        i++;
                        i2++;
                    }
                    Object[] array = arrayList.toArray(new Integer[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    Integer[] numArr = (Integer[]) array;
                    obtainTypedArray.recycle();
                    ArrayList arrayList2 = new ArrayList(stringArray.length);
                    int length2 = stringArray.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length2) {
                        int i5 = i4 + 1;
                        String a = C1764a.m5928a("Filter_%02d/", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                        C89219l.m154716b(a, "");
                        arrayList2.add(a);
                        i3++;
                        i4 = i5;
                    }
                    Object[] array2 = arrayList2.toArray(new String[0]);
                    Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                    return new C50755b(stringArray, stringArray2, numArr, (String[]) array2);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C50782h invoke() {
            C50670a aVar = C50670a.f117014a;
            C50674d dVar = new C50674d();
            C50673c cVar = C50673c.f117017a;
            C50676e eVar = C50676e.f117020a;
            C50672b bVar = C50672b.f117016a;
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            C50782h hVar = new C50782h(application, new AbstractC27255q(this) {
                /* class com.p2082ss.android.ugc.aweme.filter.p2984d.p2985a.C50654c.C50668e.C506691 */

                /* renamed from: a */
                final /* synthetic */ C50668e f117013a;

                static {
                    Covode.recordClassIndex(59831);
                }

                {
                    this.f117013a = r1;
                }

                @Override // com.google.p1998c.p1999a.AbstractC27255q
                /* renamed from: b */
                public final /* synthetic */ Object mo5560b() {
                    return this.f117013a.f117012a.mo86007e();
                }
            }, this.f117012a.mo86010h());
            C89219l.m154721d(aVar, "");
            hVar.f117197b = aVar;
            C89219l.m154721d(dVar, "");
            hVar.f117198c = dVar;
            C89219l.m154721d(cVar, "");
            hVar.f117199d = cVar;
            C89219l.m154721d(eVar, "");
            hVar.f117200e = eVar;
            if (C50647b.m94905a()) {
                C89219l.m154721d(bVar, "");
                hVar.f117196a = bVar;
            }
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$b */
    static final class C50665b extends AbstractC89220m implements AbstractC89171a<C50678d> {

        /* renamed from: a */
        public static final C50665b f117009a = new C50665b();

        static {
            Covode.recordClassIndex(59827);
        }

        C50665b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C50678d invoke() {
            return new C50678d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$c */
    static final class C50666c extends AbstractC89220m implements AbstractC89171a<C50679e> {

        /* renamed from: a */
        final /* synthetic */ C50654c f117010a;

        static {
            Covode.recordClassIndex(59828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50666c(C50654c cVar) {
            super(0);
            this.f117010a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C50679e invoke() {
            return new C50679e(this.f117010a.mo86006d());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$d */
    static final class C50667d extends AbstractC89220m implements AbstractC89171a<AbstractC50707o> {

        /* renamed from: a */
        final /* synthetic */ C50654c f117011a;

        static {
            Covode.recordClassIndex(59829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50667d(C50654c cVar) {
            super(0);
            this.f117011a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC50707o invoke() {
            return ((AbstractC50708p) this.f117011a.f116992a.getValue()).mo86073a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.d.a.c$f */
    static final class C50677f<T> implements AbstractC27255q {

        /* renamed from: a */
        public static final C50677f f117021a = new C50677f();

        static {
            Covode.recordClassIndex(59839);
        }

        C50677f() {
        }

        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ Object mo5560b() {
            if (C50647b.m94905a()) {
                if (C50646a.m94904a()) {
                    return "filtercomposerexperiment";
                }
                return "filtercomposer";
            } else if (C50646a.m94904a()) {
                return "colorfilterexperiment";
            } else {
                return "colorfilternew";
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a
    /* renamed from: e */
    public final AbstractC46415f mo86007e() {
        AbstractC46415f fVar;
        MethodCollector.m26663i(5636);
        synchronized (this) {
            try {
                fVar = this.f116998g;
                if (fVar == null) {
                    Application application = C63247i.f143610a;
                    C89219l.m154716b(application, "");
                    fVar = C46404c.m89554a(application, null);
                }
                this.f116998g = fVar;
            } finally {
                MethodCollector.m26664o(5636);
            }
        }
        return fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a
    /* renamed from: g */
    public final void mo86009g() {
        AbstractC46415f fVar;
        MethodCollector.m26663i(5644);
        synchronized (this) {
            try {
                fVar = this.f116998g;
                this.f116998g = null;
            } catch (Throwable th) {
                MethodCollector.m26664o(5644);
                throw th;
            }
        }
        if (fVar != null) {
            fVar.mo78891a(mo86010h().mo5560b());
            MethodCollector.m26664o(5644);
            return;
        }
        MethodCollector.m26664o(5644);
    }
}
