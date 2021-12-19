package com.p2082ss.android.ugc.aweme.ftc;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.utils.C80561hz;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import java.io.File;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.a */
public final class C51811a {

    /* renamed from: a */
    public static final C51811a f119438a = new C51811a();

    private C51811a() {
    }

    static {
        Covode.recordClassIndex(61180);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.a$a */
    public static final class C51812a extends AbstractC89220m implements AbstractC89172b<Boolean, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f119439a;

        /* renamed from: b */
        final /* synthetic */ Context f119440b;

        static {
            Covode.recordClassIndex(61181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51812a(String str, Context context) {
            super(1);
            this.f119439a = str;
            this.f119440b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            boolean z = false;
            if (bool.booleanValue()) {
                if (TextUtils.equals("share_to_tt", this.f119439a)) {
                    if (!C63244g.m114602a().mo73255A().mo93901a() && C80561hz.m139646a()) {
                        if (TextUtils.equals("US", C63244g.m114602a().mo73297y().mo93847a())) {
                            ((C23023b) C23028c.m43435a(new C23023b(this.f119440b).mo37411b(this.f119440b.getResources().getString(R.string.fsv)).mo37413d(this.f119440b.getResources().getString(R.string.fsu)), new AbstractC89172b<C23025b, C89391z>(this) {
                                /* class com.p2082ss.android.ugc.aweme.ftc.C51811a.C51812a.C518131 */

                                /* renamed from: a */
                                final /* synthetic */ C51812a f119441a;

                                static {
                                    Covode.recordClassIndex(61182);
                                }

                                {
                                    this.f119441a = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                public final /* synthetic */ C89391z invoke(C23025b bVar) {
                                    C23025b bVar2 = bVar;
                                    C89219l.m154721d(bVar2, "");
                                    String string = this.f119441a.f119440b.getResources().getString(R.string.fst);
                                    C89219l.m154716b(string, "");
                                    bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                                        /* class com.p2082ss.android.ugc.aweme.ftc.C51811a.C51812a.C518131.C518141 */

                                        /* renamed from: a */
                                        final /* synthetic */ C518131 f119442a;

                                        static {
                                            Covode.recordClassIndex(61183);
                                        }

                                        {
                                            this.f119442a = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                        public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                            C89219l.m154721d(aVar, "");
                                            Context context = this.f119442a.f119441a.f119440b;
                                            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                                            ((Activity) context).finish();
                                            return C89391z.f203057a;
                                        }
                                    });
                                    return C89391z.f203057a;
                                }
                            }).mo37482a(false)).mo37405a().mo37396b().show();
                        } else {
                            ((C23023b) C23028c.m43435a(new C23023b(this.f119440b).mo37411b(this.f119440b.getResources().getString(R.string.fss)).mo37413d(this.f119440b.getResources().getString(R.string.fsq) + "\n" + this.f119440b.getResources().getString(R.string.fsr)), new AbstractC89172b<C23025b, C89391z>(this) {
                                /* class com.p2082ss.android.ugc.aweme.ftc.C51811a.C51812a.C518152 */

                                /* renamed from: a */
                                final /* synthetic */ C51812a f119443a;

                                static {
                                    Covode.recordClassIndex(61184);
                                }

                                {
                                    this.f119443a = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                public final /* synthetic */ C89391z invoke(C23025b bVar) {
                                    C23025b bVar2 = bVar;
                                    C89219l.m154721d(bVar2, "");
                                    String string = this.f119443a.f119440b.getResources().getString(R.string.fsp);
                                    C89219l.m154716b(string, "");
                                    bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                                        /* class com.p2082ss.android.ugc.aweme.ftc.C51811a.C51812a.C518152.C518161 */

                                        /* renamed from: a */
                                        final /* synthetic */ C518152 f119444a;

                                        static {
                                            Covode.recordClassIndex(61185);
                                        }

                                        {
                                            this.f119444a = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                        public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                            C89219l.m154721d(aVar, "");
                                            Context context = this.f119444a.f119443a.f119440b;
                                            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                                            ((Activity) context).finish();
                                            return C89391z.f203057a;
                                        }
                                    });
                                    return C89391z.f203057a;
                                }
                            }).mo37482a(false)).mo37405a().mo37396b().show();
                        }
                        C39162r.m79460a("show_u13_video_import_error", new C84425b().mo129406a("enter_from", "share_to_tt").f188764a);
                    }
                } else if (!C63244g.m114602a().mo73255A().mo93901a() && C80561hz.m139646a()) {
                    C39162r.m79460a("show_u13_video_import_error", new C84425b().mo129406a("enter_from", this.f119439a).f188764a);
                    if (TextUtils.equals("US", C63244g.m114602a().mo73297y().mo93847a())) {
                        C23028c.m43435a(new C23023b(this.f119440b).mo37411b(this.f119440b.getResources().getString(R.string.h_2)).mo37413d(this.f119440b.getResources().getString(R.string.h_1)), new AbstractC89172b<C23025b, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ftc.C51811a.C51812a.C518173 */

                            /* renamed from: a */
                            final /* synthetic */ C51812a f119445a;

                            static {
                                Covode.recordClassIndex(61186);
                            }

                            {
                                this.f119445a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23025b bVar) {
                                C23025b bVar2 = bVar;
                                C89219l.m154721d(bVar2, "");
                                String string = this.f119445a.f119440b.getResources().getString(R.string.h_0);
                                C89219l.m154716b(string, "");
                                bVar2.mo37417a(string, C518181.f119446a);
                                return C89391z.f203057a;
                            }
                        }).mo37405a().mo37396b().show();
                    } else {
                        C23028c.m43435a(new C23023b(this.f119440b).mo37411b(this.f119440b.getResources().getString(R.string.h9z)).mo37413d(this.f119440b.getResources().getString(R.string.h9x) + "\n " + this.f119440b.getResources().getString(R.string.h9y)), new AbstractC89172b<C23025b, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.ftc.C51811a.C51812a.C518194 */

                            /* renamed from: a */
                            final /* synthetic */ C51812a f119447a;

                            static {
                                Covode.recordClassIndex(61188);
                            }

                            {
                                this.f119447a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23025b bVar) {
                                C23025b bVar2 = bVar;
                                C89219l.m154721d(bVar2, "");
                                String string = this.f119447a.f119440b.getResources().getString(R.string.h9w);
                                C89219l.m154716b(string, "");
                                bVar2.mo37417a(string, C518201.f119448a);
                                return C89391z.f203057a;
                            }
                        }).mo37405a().mo37396b().show();
                    }
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private static boolean m96525a(String str, AbstractC89172b<? super Boolean, Boolean> bVar) {
        String str2;
        C89219l.m154721d(bVar, "");
        C85581w wVar = new C85581w(new File(C31012a.m63726b().getFilesDir(), "kmVideo").getPath());
        String[] strArr = new String[1];
        int i = 0;
        do {
            strArr[0] = str;
            i++;
        } while (i <= 0);
        wVar.mo131628a(strArr, (String[]) null, (String[]) null, C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
        try {
            String a = wVar.mo131632a("com.android.information");
            if (a == null || a.length() == 0) {
                str2 = wVar.mo131632a("com.apple.quicktime.information");
            } else {
                str2 = wVar.mo131632a("com.android.information");
            }
            if (str2 == null || str2.length() == 0) {
                return bVar.invoke(false).booleanValue();
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("com.bytedance.info") || !new JSONObject(jSONObject.get("com.bytedance.info").toString()).has("is_km_video")) {
                return bVar.invoke(false).booleanValue();
            }
            return bVar.invoke(true).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            wVar.mo131703j();
            return bVar.invoke(false).booleanValue();
        }
    }

    /* renamed from: a */
    public static boolean m96524a(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str2, "");
        return m96525a(str, new C51812a(str2, context));
    }
}
