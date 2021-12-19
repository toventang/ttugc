package com.bytedance.android.livesdk.feed.network;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.feed.services.C8680b;
import com.bytedance.android.livesdk.feed.services.FeedItemDeserializer;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.google.gson.C28022o;
import com.google.gson.C28023p;
import com.google.gson.EnumC27902d;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class GsonProvider implements C8680b.AbstractC8682b<C27910f> {
    static {
        Covode.recordClassIndex(9504);
    }

    /* renamed from: com.bytedance.android.livesdk.feed.network.GsonProvider$a */
    static class C8648a extends AbstractC28031v<Boolean> {
        static {
            Covode.recordClassIndex(9512);
        }

        private C8648a() {
        }

        /* synthetic */ C8648a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Boolean read(C27897a aVar) {
            EnumC27899b f = aVar.mo46627f();
            int i = C86471.f21363a[f.ordinal()];
            boolean z = true;
            if (i == 1) {
                return Boolean.valueOf(aVar.mo46630j());
            }
            if (i == 2) {
                aVar.mo46631k();
                return null;
            } else if (i == 3) {
                if (aVar.mo46634n() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else {
                throw new C28023p("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null) {
                cVar.mo46654f();
            } else {
                cVar.mo46643a(bool2);
            }
        }
    }

    static class RoomDeserializer implements AbstractC28018k<Room> {

        /* renamed from: a */
        private C27910f f21365a;

        static {
            Covode.recordClassIndex(9511);
        }

        private RoomDeserializer() {
            this.f21365a = C4139e.C4140a.f11575b;
        }

        /* synthetic */ RoomDeserializer(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28018k
        /* renamed from: a */
        public final /* synthetic */ Room mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
            Room room = (Room) this.f21365a.mo46668a(lVar, type);
            room.init();
            return room;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.network.GsonProvider$1 */
    static /* synthetic */ class C86471 {

        /* renamed from: a */
        static final /* synthetic */ int[] f21363a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 9505(0x2521, float:1.332E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.p2020c.EnumC27899b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.feed.network.GsonProvider.C86471.f21363a = r2
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.feed.network.GsonProvider.C86471.f21363a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NULL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.feed.network.GsonProvider.C86471.f21363a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.network.GsonProvider.C86471.<clinit>():void");
        }
    }

    static class BaseListResponseDeserializer extends AbsJsonDeserializer<C5827a> {
        static {
            Covode.recordClassIndex(9507);
        }

        public BaseListResponseDeserializer(C27910f fVar) {
            super(fVar);
        }

        @Override // com.google.gson.AbstractC28018k
        /* renamed from: a */
        public final /* synthetic */ Object mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
            C28022o j = lVar.mo46789j();
            int g = j.mo46803c("status_code").mo46694g();
            if (g == 0) {
                return this.f21364a.mo46668a(lVar, type);
            }
            C5827a aVar = new C5827a();
            aVar.f14683a = g;
            aVar.f14686d = (RequestError) this.f21364a.mo46667a(j.mo46803c("data"), RequestError.class);
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments.length > 1) {
                    aVar.f14685c = (R) ((Extra) this.f21364a.mo46668a(j.mo46803c("extra"), actualTypeArguments[1]));
                    return aVar;
                }
            }
            aVar.f14685c = (R) ((Extra) this.f21364a.mo46667a(j.mo46803c("extra"), Extra.class));
            return aVar;
        }
    }

    static class BaseResponseDeserializer extends AbsJsonDeserializer<C5830b> {
        static {
            Covode.recordClassIndex(9508);
        }

        BaseResponseDeserializer(C27910f fVar) {
            super(fVar);
        }

        @Override // com.google.gson.AbstractC28018k
        /* renamed from: a */
        public final /* synthetic */ Object mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
            C5830b bVar = (C5830b) this.f21364a.mo46668a(lVar, type);
            if (bVar.statusCode != 0) {
                bVar.error = (RequestError) this.f21364a.mo46667a(lVar.mo46789j().mo46803c("data"), RequestError.class);
            }
            return bVar;
        }
    }

    static class ListResponseDeserializer extends AbsJsonDeserializer<C5831c> {
        static {
            Covode.recordClassIndex(9509);
        }

        public ListResponseDeserializer(C27910f fVar) {
            super(fVar);
        }

        @Override // com.google.gson.AbstractC28018k
        /* renamed from: a */
        public final /* synthetic */ Object mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
            C28022o j = lVar.mo46789j();
            int g = j.mo46803c("status_code").mo46694g();
            if (g == 0) {
                return this.f21364a.mo46668a(lVar, type);
            }
            C5831c cVar = new C5831c();
            cVar.f14683a = g;
            cVar.f14685c = (Extra) this.f21364a.mo46667a(j.mo46803c("extra"), Extra.class);
            cVar.f14686d = (RequestError) this.f21364a.mo46667a(j.mo46803c("data"), RequestError.class);
            return cVar;
        }
    }

    static class ResponseDeserializer extends AbsJsonDeserializer<C5832d> {
        static {
            Covode.recordClassIndex(9510);
        }

        ResponseDeserializer(C27910f fVar) {
            super(fVar);
        }

        @Override // com.google.gson.AbstractC28018k
        /* renamed from: a */
        public final /* synthetic */ Object mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
            C5832d dVar = (C5832d) this.f21364a.mo46668a(lVar, type);
            if (dVar.statusCode != 0) {
                dVar.error = (RequestError) this.f21364a.mo46667a(lVar.mo46789j().mo46803c("data"), RequestError.class);
            }
            return dVar;
        }
    }

    static abstract class AbsJsonDeserializer<T> implements AbstractC28018k<T> {

        /* renamed from: a */
        protected C27910f f21364a;

        static {
            Covode.recordClassIndex(9506);
        }

        public AbsJsonDeserializer(C27910f fVar) {
            this.f21364a = fVar;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.services.C8680b.AbstractC8682b
    /* renamed from: a */
    public final C8680b.AbstractC8682b.C8683a<C27910f> mo14951a(C8680b.AbstractC8682b.C8683a<C27910f> aVar) {
        C27917g gVar = new C27917g();
        gVar.f65562b = EnumC27902d.LOWER_CASE_WITH_UNDERSCORES;
        gVar.mo46681a((Type) Room.class, (Object) new RoomDeserializer((byte) 0));
        gVar.mo46681a((Type) FeedItem.class, (Object) new FeedItemDeserializer());
        gVar.mo46681a((Type) Boolean.class, (Object) new C8648a((byte) 0));
        gVar.mo46681a((Type) Boolean.TYPE, (Object) new C8648a((byte) 0));
        C27917g gVar2 = new C27917g();
        gVar2.f65562b = EnumC27902d.LOWER_CASE_WITH_UNDERSCORES;
        gVar2.mo46681a((Type) Room.class, (Object) new RoomDeserializer((byte) 0));
        gVar2.mo46681a((Type) FeedItem.class, (Object) new FeedItemDeserializer());
        gVar2.mo46681a((Type) Boolean.class, (Object) new C8648a((byte) 0));
        gVar2.mo46681a((Type) Boolean.TYPE, (Object) new C8648a((byte) 0));
        C27910f b = gVar2.mo46682b();
        gVar.mo46681a((Type) C5830b.class, (Object) new BaseResponseDeserializer(b));
        gVar.mo46681a((Type) C5832d.class, (Object) new ResponseDeserializer(b));
        gVar.mo46681a((Type) C5827a.class, (Object) new BaseListResponseDeserializer(b));
        gVar.mo46681a((Type) C5831c.class, (Object) new ListResponseDeserializer(b));
        aVar.f21433a = (R) gVar.mo46682b();
        aVar.f21434b = true;
        return aVar;
    }
}
