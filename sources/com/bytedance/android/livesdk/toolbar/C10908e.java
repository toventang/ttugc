package com.bytedance.android.livesdk.toolbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.livesdk.gift.model.C8843h;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftIconDailyEffect;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.toolbar.C10905d;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.C24296c;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.AbstractC24160e;
import java.util.Objects;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.toolbar.e */
public final class C10908e extends FrameLayout implements C10905d.AbstractC10906a {

    /* renamed from: a */
    public DataChannel f26208a;

    /* renamed from: b */
    public C10905d f26209b;

    /* renamed from: c */
    public HSImageView f26210c;

    /* renamed from: d */
    public C88411a f26211d = new C88411a();

    /* renamed from: e */
    public ImageView f26212e;

    /* renamed from: f */
    public LiveAutoRtlTextView f26213f;

    /* renamed from: g */
    public String f26214g = "daily";

    /* renamed from: h */
    public String f26215h;

    /* renamed from: i */
    public boolean f26216i;

    static {
        Covode.recordClassIndex(12516);
    }

    /* renamed from: com.bytedance.android.livesdk.toolbar.e$c */
    public static final class C10914c implements AbstractC24160e<Void> {

        /* renamed from: a */
        final /* synthetic */ C10908e f26225a;

        /* renamed from: b */
        final /* synthetic */ C8843h f26226b;

        static {
            Covode.recordClassIndex(12522);
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onCancellation(AbstractC24157c<Void> cVar) {
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onFailure(AbstractC24157c<Void> cVar) {
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onProgressUpdate(AbstractC24157c<Void> cVar) {
        }

        /* renamed from: com.bytedance.android.livesdk.toolbar.e$c$a */
        public static final class C10915a extends AbstractC24435b {

            /* renamed from: a */
            final /* synthetic */ C10914c f26227a;

            static {
                Covode.recordClassIndex(12523);
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
            }

            /* renamed from: com.bytedance.android.livesdk.toolbar.e$c$a$a */
            static final class RunnableC10916a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C10915a f26228a;

                /* renamed from: b */
                final /* synthetic */ Bitmap f26229b;

                static {
                    Covode.recordClassIndex(12524);
                }

                RunnableC10916a(C10915a aVar, Bitmap bitmap) {
                    this.f26228a = aVar;
                    this.f26229b = bitmap;
                }

                public final void run() {
                    ImageView imageView = this.f26228a.f26227a.f26225a.f26212e;
                    if (imageView != null) {
                        imageView.setImageBitmap(this.f26229b);
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C10915a(C10914c cVar) {
                this.f26227a = cVar;
            }

            @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
            /* renamed from: a */
            public final void mo9033a(Bitmap bitmap) {
                this.f26227a.f26225a.post(new RunnableC10916a(this, bitmap));
            }
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onNewResult(AbstractC24157c<Void> cVar) {
            this.f26225a.f26214g = "event";
            this.f26225a.f26215h = C3951p.m9619a(this.f26226b.f21723i);
            C3941k.m9611a(C3951p.m9619a(this.f26226b.f21720f), new C10915a(this));
        }

        C10914c(C10908e eVar, C8843h hVar) {
            this.f26225a = eVar;
            this.f26226b = hVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.toolbar.e$b */
    public static final class C10912b extends AbstractC24435b {

        /* renamed from: a */
        final /* synthetic */ C10908e f26222a;

        static {
            Covode.recordClassIndex(12520);
        }

        @Override // com.facebook.p1844d.AbstractC24156b
        public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
        }

        /* renamed from: com.bytedance.android.livesdk.toolbar.e$b$a */
        static final class RunnableC10913a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C10912b f26223a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f26224b;

            static {
                Covode.recordClassIndex(12521);
            }

            RunnableC10913a(C10912b bVar, Bitmap bitmap) {
                this.f26223a = bVar;
                this.f26224b = bitmap;
            }

            public final void run() {
                ImageView imageView = this.f26223a.f26222a.f26212e;
                if (imageView != null) {
                    imageView.setImageBitmap(this.f26224b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10912b(C10908e eVar) {
            this.f26222a = eVar;
        }

        @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
        /* renamed from: a */
        public final void mo9033a(Bitmap bitmap) {
            this.f26222a.post(new RunnableC10913a(this, bitmap));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.toolbar.e$a */
    public static final class C10909a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10908e f26217a;

        static {
            Covode.recordClassIndex(12517);
        }

        public C10909a(C10908e eVar) {
            this.f26217a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String a;
            if (!C89219l.m154714a((Object) this.f26217a.f26214g, (Object) "daily") || LiveGiftIconDailyEffect.INSTANCE.getValue()) {
                if (this.f26217a.f26215h != null) {
                    a = this.f26217a.f26215h;
                } else if (this.f26217a.f26216i) {
                    a = HSAnimImageView.f11029i.mo9399a("tiktok_live_basic_resource", "ttlive_gift_icon_effect_normal_without_background.webp");
                } else {
                    a = HSAnimImageView.f11029i.mo9399a("tiktok_live_basic_resource", "ttlive_gift_icon_effect_normal.webp");
                }
                C11279p.m20008a((View) this.f26217a.f26210c, true);
                HSImageView hSImageView = this.f26217a.f26210c;
                if (hSImageView != null) {
                    C24185e a2 = C24182c.m45843b().mo39797a(a);
                    a2.f57306j = true;
                    a2.f57303g = new C24202c<AbstractC24457f>(this) {
                        /* class com.bytedance.android.livesdk.toolbar.C10908e.C10909a.C109101 */

                        /* renamed from: a */
                        final /* synthetic */ C10909a f26218a;

                        static {
                            Covode.recordClassIndex(12518);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f26218a = r1;
                        }

                        /* renamed from: com.bytedance.android.livesdk.toolbar.e$a$1$a */
                        public static final class C10911a extends C24296c {

                            /* renamed from: a */
                            final /* synthetic */ C109101 f26219a;

                            /* renamed from: b */
                            final /* synthetic */ int f26220b;

                            /* renamed from: c */
                            private int f26221c;

                            static {
                                Covode.recordClassIndex(12519);
                            }

                            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
                            /* renamed from: b */
                            public final void mo9285b(C24290a aVar) {
                                C89219l.m154721d(aVar, "");
                            }

                            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
                            /* renamed from: a */
                            public final void mo9283a(C24290a aVar) {
                                C89219l.m154721d(aVar, "");
                                this.f26221c = -1;
                                String str = this.f26219a.f26218a.f26217a.f26214g;
                                C89219l.m154721d(str, "");
                                C6501b.C6502a.m13948a("special_gift_icon_show").mo12651a("enter_from_merge", C6544e.m13987a()).mo12651a("enter_method", C6544e.m13990d()).mo12651a("action_type", C6544e.m13991e()).mo12651a("animation_type", str).mo12655b();
                            }

                            C10911a(C109101 r1, int i) {
                                this.f26219a = r1;
                                this.f26220b = i;
                            }

                            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
                            /* renamed from: a */
                            public final void mo9284a(C24290a aVar, int i) {
                                C89219l.m154721d(aVar, "");
                                int i2 = this.f26221c;
                                if ((i2 != 0 || this.f26220b > 1) && i2 <= i) {
                                    this.f26221c = i;
                                    return;
                                }
                                aVar.stop();
                                ImageView imageView = this.f26219a.f26218a.f26217a.f26212e;
                                if (imageView != null) {
                                    C11279p.m20008a((View) imageView, true);
                                }
                                HSImageView hSImageView = this.f26219a.f26218a.f26217a.f26210c;
                                if (hSImageView != null) {
                                    C11279p.m20008a((View) hSImageView, false);
                                }
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                            C89219l.m154721d(str, "");
                            ImageView imageView = this.f26218a.f26217a.f26212e;
                            if (imageView != null) {
                                C11279p.m20008a((View) imageView, false);
                            }
                            Objects.requireNonNull(animatable, "null cannot be cast to non-null type com.facebook.fresco.animation.drawable.AnimatedDrawable2");
                            C24290a aVar = (C24290a) animatable;
                            aVar.mo40070a(new C10911a(this, aVar.mo40072c()));
                        }
                    };
                    hSImageView.setController(a2.mo39827e());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    @Override // com.bytedance.android.livesdk.toolbar.C10905d.AbstractC10906a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17772a(com.bytedance.android.livesdk.gift.model.C8843h r5) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.toolbar.C10908e.mo17772a(com.bytedance.android.livesdk.gift.model.h):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10908e(Context context, DataChannel dataChannel) {
        super(context);
        boolean z;
        C89219l.m154721d(context, "");
        C89219l.m154721d(dataChannel, "");
        MethodCollector.m26663i(6454);
        this.f26208a = dataChannel;
        Boolean bool = (Boolean) this.f26208a.mo28318b(C9114dz.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f26216i = z;
        MethodCollector.m26664o(6454);
    }
}
