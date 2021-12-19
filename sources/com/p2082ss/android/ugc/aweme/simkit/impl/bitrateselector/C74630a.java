package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34843a;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34844b;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34846d;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34847e;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81963b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a */
final class C74630a {

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$c */
    static class C74634c {
        static {
            Covode.recordClassIndex(87457);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$g */
    static class C74643g {
        static {
            Covode.recordClassIndex(87466);
        }
    }

    static {
        Covode.recordClassIndex(87453);
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$a */
    static class C74631a {
        static {
            Covode.recordClassIndex(87454);
        }

        /* renamed from: a */
        static AbstractC34843a m131064a(final AbstractC81962a aVar) {
            if (aVar == null) {
                return null;
            }
            return new AbstractC34843a() {
                /* class com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74630a.C74631a.C746321 */

                static {
                    Covode.recordClassIndex(87455);
                }

                @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34843a
                /* renamed from: a */
                public final double mo61692a() {
                    return aVar.mo61720a();
                }

                @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34843a
                /* renamed from: b */
                public final double mo61693b() {
                    return aVar.mo61721b();
                }

                @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34843a
                /* renamed from: c */
                public final double mo61694c() {
                    return aVar.mo61722c();
                }

                @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34843a
                /* renamed from: d */
                public final double mo61695d() {
                    return aVar.mo61723d();
                }

                @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34843a
                /* renamed from: e */
                public final double mo61696e() {
                    return aVar.mo61724e();
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$d */
    static class C74636d {
        static {
            Covode.recordClassIndex(87459);
        }

        /* renamed from: a */
        static AbstractC81964c m131073a(final AbstractC34845c cVar) {
            if (cVar == null) {
                return null;
            }
            return new AbstractC81964c() {
                /* class com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74630a.C74636d.C746371 */

                static {
                    Covode.recordClassIndex(87460);
                }

                @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
                public final int getBitRate() {
                    return cVar.mo61699a();
                }

                @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
                public final String getChecksum() {
                    return cVar.mo61705g();
                }

                @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
                public final String getGearName() {
                    return cVar.mo61700b();
                }

                @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
                public final int getQualityType() {
                    return cVar.mo61701c();
                }

                @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
                public final int getSize() {
                    return cVar.mo61706h();
                }

                @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
                public final String getUrlKey() {
                    return cVar.mo61703e();
                }

                @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
                public final int isBytevc1() {
                    return cVar.mo61702d();
                }

                @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
                public final List<String> urlList() {
                    return cVar.mo61704f();
                }

                public final String toString() {
                    return "BitRate{bitRate=" + cVar.mo61699a() + ", gearName='" + cVar.mo61700b() + '\'' + ", qualityType=" + cVar.mo61701c() + ", isBytevc1=" + cVar.mo61702d() + '}';
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$f */
    static class C74641f {
        static {
            Covode.recordClassIndex(87464);
        }

        /* renamed from: a */
        static AbstractC34846d m131091a(final AbstractC81965d dVar) {
            if (dVar == null) {
                return null;
            }
            return new AbstractC34846d() {
                /* class com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74630a.C74641f.C746421 */

                static {
                    Covode.recordClassIndex(87465);
                }

                @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34846d
                /* renamed from: a */
                public final String mo61707a() {
                    return dVar.mo61737a();
                }

                @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34846d
                /* renamed from: b */
                public final Set<String> mo61708b() {
                    return dVar.mo61738b();
                }

                @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34846d
                /* renamed from: c */
                public final double mo61709c() {
                    return dVar.mo61739c();
                }

                @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34846d
                /* renamed from: d */
                public final Pair<Double, Double> mo61710d() {
                    return dVar.mo61740d();
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$b */
    static class C74633b {
        static {
            Covode.recordClassIndex(87456);
        }

        /* renamed from: a */
        static List<? extends AbstractC34844b> m131070a(List<? extends AbstractC81963b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (AbstractC81963b bVar : list) {
                arrayList.add(bVar == null ? null : new AbstractC34844b(bVar) {
                    /* class com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74630a.C74634c.C746351 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC81963b f167784a;

                    static {
                        Covode.recordClassIndex(87458);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34844b
                    /* renamed from: a */
                    public final double mo61697a() {
                        return this.f167784a.getSpeed();
                    }

                    @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34844b
                    /* renamed from: b */
                    public final double mo61698b() {
                        return this.f167784a.getBitrate();
                    }

                    {
                        this.f167784a = r1;
                    }
                });
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$e */
    static class C74639e {
        static {
            Covode.recordClassIndex(87462);
        }

        /* renamed from: a */
        static List<? extends AbstractC34845c> m131082a(List<C84237e> list) {
            if (list == null || list.size() == 0) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (final C84237e eVar : list) {
                if (eVar != null) {
                    arrayList.add(new AbstractC34845c() {
                        /* class com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74630a.C74639e.C746401 */

                        static {
                            Covode.recordClassIndex(87463);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c
                        /* renamed from: a */
                        public final int mo61699a() {
                            return eVar.getBitRate();
                        }

                        @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c
                        /* renamed from: b */
                        public final String mo61700b() {
                            return eVar.getGearName();
                        }

                        @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c
                        /* renamed from: c */
                        public final int mo61701c() {
                            return eVar.getQualityType();
                        }

                        @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c
                        /* renamed from: d */
                        public final int mo61702d() {
                            return eVar.isBytevc1();
                        }

                        @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c
                        /* renamed from: e */
                        public final String mo61703e() {
                            return eVar.getUrlKey();
                        }

                        @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c
                        /* renamed from: f */
                        public final List<String> mo61704f() {
                            return eVar.urlList();
                        }

                        @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c
                        /* renamed from: g */
                        public final String mo61705g() {
                            return eVar.getChecksum();
                        }

                        @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c
                        /* renamed from: h */
                        public final int mo61706h() {
                            return eVar.getSize();
                        }

                        public final String toString() {
                            return "BitRate{bitRate=" + eVar.getBitRate() + ", gearName='" + eVar.getGearName() + '\'' + ", qualityType=" + eVar.getQualityType() + ", isBytevc1=" + eVar.isBytevc1() + '}';
                        }
                    });
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$h */
    static class C74645h {
        static {
            Covode.recordClassIndex(87468);
        }

        /* renamed from: a */
        static List<? extends AbstractC34847e> m131099a(List<? extends AbstractC81966e> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (AbstractC81966e eVar : list) {
                arrayList.add(eVar == null ? null : new AbstractC34847e(eVar) {
                    /* class com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74630a.C74643g.C746441 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC81966e f167789a;

                    static {
                        Covode.recordClassIndex(87467);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34847e
                    /* renamed from: a */
                    public final int mo61711a() {
                        return this.f167789a.getNetworkUpper();
                    }

                    @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34847e
                    /* renamed from: b */
                    public final int mo61712b() {
                        return this.f167789a.getNetworkLower();
                    }

                    @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34847e
                    /* renamed from: c */
                    public final int mo61713c() {
                        return this.f167789a.getBitRate();
                    }

                    {
                        this.f167789a = r1;
                    }
                });
            }
            return arrayList;
        }
    }
}
