package com.p2082ss.android.ugc.aweme.p4173ug.praise;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1712a.C23017a;
import com.bytedance.tux.dialog.p1712a.C23020d;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1716e.C23053d;
import com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.C79604c;
import com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.C79607d;
import com.p2082ss.android.ugc.aweme.p4173ug.p4179e.C79624a;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.AbstractC79681a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.b */
public final class C79684b {

    /* renamed from: b */
    public static final C79685a f178801b = new C79685a((byte) 0);

    /* renamed from: a */
    public final AbstractC79681a f178802a;

    static {
        Covode.recordClassIndex(92901);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b$a */
    public static final class C79685a {
        static {
            Covode.recordClassIndex(92902);
        }

        private C79685a() {
        }

        /* renamed from: a */
        public static boolean m138506a() {
            if (!C79624a.m138425a() || C79607d.m138388a(C79604c.C79605a.f178616a, Bitmap.class) != null) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C79685a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b$b */
    public enum EnumC79686b {
        ACTIVATION("activation"),
        LIKE("like"),
        WALLPAPER("wallpaper");
        

        /* renamed from: b */
        private final String f178804b;

        public final String getValue() {
            return this.f178804b;
        }

        static {
            Covode.recordClassIndex(92903);
        }

        private EnumC79686b(String str) {
            this.f178804b = str;
        }
    }

    /* renamed from: a */
    public final void mo123228a() {
        MethodCollector.m26663i(5987);
        ImageView imageView = new ImageView(this.f178802a.f178793c);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        String str = "";
        if (C79624a.m138425a()) {
            String str2 = C79604c.C79605a.f178616a;
            C89219l.m154721d(imageView, str);
            C89219l.m154721d(str2, str);
            Bitmap bitmap = (Bitmap) C79607d.m138388a(str2, Bitmap.class);
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
        } else {
            imageView.setImageResource(2131234919);
        }
        C23023b c = C23053d.m43470a(C23013a.C23015a.m43405a(this.f178802a.f178793c), imageView).mo37411b(this.f178802a.mo123221a().f178795a).mo37413d(this.f178802a.mo123221a().f178796b);
        String str3 = this.f178802a.mo123221a().f178797c;
        C79687c cVar = new C79687c(this);
        C89219l.m154719c(c, str);
        C23020d dVar = new C23020d(c.f54592n);
        if (str3 != null) {
            str = str3;
        }
        dVar.mo37403a(str);
        cVar.invoke(dVar);
        c.mo37406a(dVar);
        ((C23023b) C23028c.m43435a(c, new C79689d(this)).mo37482a(false)).mo37405a().mo37396b().show();
        MethodCollector.m26664o(5987);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b$c */
    static final class C79687c extends AbstractC89220m implements AbstractC89172b<C23020d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79684b f178805a;

        static {
            Covode.recordClassIndex(92904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79687c(C79684b bVar) {
            super(1);
            this.f178805a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23020d dVar) {
            C23020d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo37404b();
            dVar2.mo37402a(new AbstractC89172b<C23017a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b.C79687c.C796881 */

                /* renamed from: a */
                final /* synthetic */ C79687c f178806a;

                static {
                    Covode.recordClassIndex(92905);
                }

                {
                    this.f178806a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23017a aVar) {
                    C23017a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    AbstractC79681a aVar3 = this.f178806a.f178805a.f178802a;
                    aVar3.mo123222a("rating_feedback");
                    aVar3.f178791a.mo123233a(true);
                    aVar3.mo123224c();
                    aVar2.mo37399a().dismiss();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b$d */
    static final class C79689d extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79684b f178807a;

        static {
            Covode.recordClassIndex(92906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79689d(C79684b bVar) {
            super(1);
            this.f178807a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37417a(this.f178807a.f178802a.mo123221a().f178798d, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b.C79689d.C796901 */

                /* renamed from: a */
                final /* synthetic */ C79689d f178808a;

                static {
                    Covode.recordClassIndex(92907);
                }

                {
                    this.f178808a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC79681a aVar2 = this.f178808a.f178807a.f178802a;
                    aVar2.mo123222a("rating_submit");
                    aVar2.f178791a.mo123235b(true);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    try {
                        StringBuilder sb = new StringBuilder("market://details?id=");
                        AbstractC79681a.C79682a aVar3 = aVar2.f178792b;
                        if (aVar3 == null) {
                            C89219l.m154710a("dialogContent");
                        }
                        intent.setData(Uri.parse(sb.append(aVar3.f178799e).toString()));
                        if (intent.resolveActivity(aVar2.f178793c.getPackageManager()) != null) {
                            AbstractC79681a.m138499a(aVar2.f178793c, intent);
                        } else {
                            StringBuilder sb2 = new StringBuilder("https://play.google.com/store/apps/details?id=");
                            AbstractC79681a.C79682a aVar4 = aVar2.f178792b;
                            if (aVar4 == null) {
                                C89219l.m154710a("dialogContent");
                            }
                            intent.setData(Uri.parse(sb2.append(aVar4.f178799e).toString()));
                            if (intent.resolveActivity(aVar2.f178793c.getPackageManager()) != null) {
                                AbstractC79681a.m138499a(aVar2.f178793c, intent);
                            }
                        }
                    } catch (Exception unused) {
                        StringBuilder sb3 = new StringBuilder("https://play.google.com/store/apps/details?id=");
                        AbstractC79681a.C79682a aVar5 = aVar2.f178792b;
                        if (aVar5 == null) {
                            C89219l.m154710a("dialogContent");
                        }
                        intent.setData(Uri.parse(sb3.append(aVar5.f178799e).toString()));
                        if (intent.resolveActivity(aVar2.f178793c.getPackageManager()) != null) {
                            AbstractC79681a.m138499a(aVar2.f178793c, intent);
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a7d, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b.C79689d.C796912 */

                /* renamed from: a */
                final /* synthetic */ C79689d f178809a;

                static {
                    Covode.recordClassIndex(92908);
                }

                {
                    this.f178809a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f178809a.f178807a.f178802a.mo123222a("rating_cancel");
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    public C79684b(AbstractC79681a aVar) {
        C89219l.m154721d(aVar, "");
        this.f178802a = aVar;
        aVar.f178792b = aVar.mo123223b();
        aVar.mo123222a("rating_show");
        aVar.f178791a.mo123231a(System.currentTimeMillis());
        aVar.f178791a.mo123232a(String.valueOf(C17867d.m33084e()));
    }
}
