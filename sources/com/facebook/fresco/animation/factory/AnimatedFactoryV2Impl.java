package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1830b.C24068c;
import com.facebook.common.p1830b.C24074i;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a;
import com.facebook.imagepipeline.p1871a.p1872a.C24325e;
import com.facebook.imagepipeline.p1871a.p1873b.AbstractC24327a;
import com.facebook.imagepipeline.p1871a.p1873b.AbstractC24330d;
import com.facebook.imagepipeline.p1871a.p1873b.C24331e;
import com.facebook.imagepipeline.p1871a.p1874c.AbstractC24337b;
import com.facebook.imagepipeline.p1871a.p1874c.C24336a;
import com.facebook.imagepipeline.p1871a.p1875d.C24346a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1879d.C24382h;
import com.facebook.imagepipeline.p1880e.AbstractC24410e;
import com.facebook.imagepipeline.p1882g.AbstractC24442c;
import com.facebook.imagepipeline.p1883h.AbstractC24450a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24459h;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.p1826c.p1827a.AbstractC24026e;

public class AnimatedFactoryV2Impl implements AbstractC24327a {
    public static int sAnimationCachingStrategy = 1;
    private AbstractC24337b mAnimatedDrawableBackendProvider;
    private AbstractC24450a mAnimatedDrawableFactory;
    private C24346a mAnimatedDrawableUtil;
    private AbstractC24330d mAnimatedImageFactory;
    private final C24382h<AbstractC24026e, AbstractC24454c> mBackingCache;
    private final AbstractC24410e mExecutorSupplier;
    private final AbstractC24357f mPlatformBitmapFactory;

    static {
        Covode.recordClassIndex(28433);
    }

    private AbstractC24330d buildAnimatedImageFactory() {
        return new C24331e(new AbstractC24337b() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.C243066 */

            static {
                Covode.recordClassIndex(28439);
            }

            @Override // com.facebook.imagepipeline.p1871a.p1874c.AbstractC24337b
            /* renamed from: a */
            public final AbstractC24319a mo40091a(C24325e eVar, Rect rect) {
                return new C24336a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), eVar, rect);
            }
        }, this.mPlatformBitmapFactory);
    }

    private AbstractC24337b getAnimatedDrawableBackendProvider() {
        if (this.mAnimatedDrawableBackendProvider == null) {
            this.mAnimatedDrawableBackendProvider = new AbstractC24337b() {
                /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.C243055 */

                static {
                    Covode.recordClassIndex(28438);
                }

                @Override // com.facebook.imagepipeline.p1871a.p1874c.AbstractC24337b
                /* renamed from: a */
                public final AbstractC24319a mo40091a(C24325e eVar, Rect rect) {
                    return new C24336a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), eVar, rect);
                }
            };
        }
        return this.mAnimatedDrawableBackendProvider;
    }

    public C24346a getAnimatedDrawableUtil() {
        if (this.mAnimatedDrawableUtil == null) {
            this.mAnimatedDrawableUtil = new C24346a();
        }
        return this.mAnimatedDrawableUtil;
    }

    public AbstractC24330d getAnimatedImageFactory() {
        if (this.mAnimatedImageFactory == null) {
            this.mAnimatedImageFactory = buildAnimatedImageFactory();
        }
        return this.mAnimatedImageFactory;
    }

    private C24307a createDrawableFactory() {
        C243033 r7 = new AbstractC24093k<Integer>() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.C243033 */

            static {
                Covode.recordClassIndex(28436);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.facebook.common.p1832d.AbstractC24093k
            /* renamed from: b */
            public final /* synthetic */ Integer mo34217b() {
                return Integer.valueOf(AnimatedFactoryV2Impl.sAnimationCachingStrategy);
            }
        };
        return new C24307a(getAnimatedDrawableBackendProvider(), C24074i.m45587b(), new C24068c(this.mExecutorSupplier.mo40218c()), RealtimeSinceBootClock.get(), this.mPlatformBitmapFactory, this.mBackingCache, r7, new AbstractC24093k<Integer>() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.C243044 */

            static {
                Covode.recordClassIndex(28437);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.facebook.common.p1832d.AbstractC24093k
            /* renamed from: b */
            public final /* synthetic */ Integer mo34217b() {
                return 3;
            }
        });
    }

    public static void setAnimationCachingStrategy(int i) {
        sAnimationCachingStrategy = i;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1873b.AbstractC24327a
    public AbstractC24442c getGifDecoder(final Bitmap.Config config) {
        return new AbstractC24442c() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.C243011 */

            static {
                Covode.recordClassIndex(28434);
            }

            @Override // com.facebook.imagepipeline.p1882g.AbstractC24442c
            /* renamed from: a */
            public final AbstractC24454c mo34187a(C24456e eVar, int i, AbstractC24459h hVar, C24361b bVar) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().mo40131a(eVar, bVar);
            }
        };
    }

    @Override // com.facebook.imagepipeline.p1871a.p1873b.AbstractC24327a
    public AbstractC24442c getWebPDecoder(final Bitmap.Config config) {
        return new AbstractC24442c() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.C243022 */

            static {
                Covode.recordClassIndex(28435);
            }

            @Override // com.facebook.imagepipeline.p1882g.AbstractC24442c
            /* renamed from: a */
            public final AbstractC24454c mo34187a(C24456e eVar, int i, AbstractC24459h hVar, C24361b bVar) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().mo40132b(eVar, bVar);
            }
        };
    }

    @Override // com.facebook.imagepipeline.p1871a.p1873b.AbstractC24327a
    public AbstractC24450a getAnimatedDrawableFactory(Context context) {
        if (this.mAnimatedDrawableFactory == null) {
            this.mAnimatedDrawableFactory = createDrawableFactory();
        }
        return this.mAnimatedDrawableFactory;
    }

    public AnimatedFactoryV2Impl(AbstractC24357f fVar, AbstractC24410e eVar, C24382h<AbstractC24026e, AbstractC24454c> hVar) {
        this.mPlatformBitmapFactory = fVar;
        this.mExecutorSupplier = eVar;
        this.mBackingCache = hVar;
    }
}
