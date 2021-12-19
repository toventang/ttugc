package com.bytedance.ies.sdk.widgets;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveWidgetProvider implements IWidgetProvider {
    public static final Companion Companion = new Companion(null);
    public static volatile LiveWidgetProvider sInstance;
    private final RecycledLiveWidgetPool mRecycledViewPool;

    public static final class RecycledLiveWidgetPool {
        public static final Companion Companion = new Companion(null);
        public static final int DEFAULT_MAX_SCRAP = 3;
        private final HashMap<Class<? super IRecyclableWidget>, ScrapData> mScrap = new HashMap<>();

        public static final class Companion {
            static {
                Covode.recordClassIndex(20440);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(C89214g gVar) {
                this();
            }
        }

        public static final class ScrapData {
            private final int mMaxScrap = RecycledLiveWidgetPool.DEFAULT_MAX_SCRAP;
            private final ArrayList<IRecyclableWidget> mScrapHeap = new ArrayList<>(RecycledLiveWidgetPool.DEFAULT_MAX_SCRAP);

            static {
                Covode.recordClassIndex(20441);
            }

            public final int getMMaxScrap() {
                return this.mMaxScrap;
            }

            public final ArrayList<IRecyclableWidget> getMScrapHeap() {
                return this.mScrapHeap;
            }
        }

        static {
            Covode.recordClassIndex(20439);
        }

        public final void clear() {
            Collection<ScrapData> values = this.mScrap.values();
            C89219l.m154709a((Object) values, "");
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                it.next().getMScrapHeap().clear();
            }
        }

        public final void clearWidgetCache(Class<IRecyclableWidget> cls) {
            if (cls != null) {
                getScrapDataForType(cls).getMScrapHeap().clear();
            }
        }

        public final int getRecycledViewCount(Class<? super IRecyclableWidget> cls) {
            C89219l.m154719c(cls, "");
            return getScrapDataForType(cls).getMScrapHeap().size();
        }

        public final ScrapData getScrapDataForType(Class<? super IRecyclableWidget> cls) {
            C89219l.m154719c(cls, "");
            ScrapData scrapData = this.mScrap.get(cls);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            this.mScrap.put(cls, scrapData2);
            return scrapData2;
        }

        public final IRecyclableWidget getRecycledView(Class<? super IRecyclableWidget> cls) {
            C89219l.m154719c(cls, "");
            ScrapData scrapData = this.mScrap.get(cls);
            if (scrapData == null || !(!scrapData.getMScrapHeap().isEmpty())) {
                return null;
            }
            ArrayList<IRecyclableWidget> mScrapHeap = scrapData.getMScrapHeap();
            return mScrapHeap.remove(mScrapHeap.size() - 1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.ies.sdk.widgets.LiveWidgetProvider$RecycledLiveWidgetPool */
        /* JADX WARN: Multi-variable type inference failed */
        public final void putRecycledView(IRecyclableWidget iRecyclableWidget) {
            C89219l.m154719c(iRecyclableWidget, "");
            Class<?> cls = iRecyclableWidget.getClass();
            ArrayList<IRecyclableWidget> mScrapHeap = getScrapDataForType(cls).getMScrapHeap();
            ScrapData scrapData = this.mScrap.get(cls);
            if (scrapData == null) {
                C89219l.m154707a();
            }
            if (scrapData.getMMaxScrap() > mScrapHeap.size()) {
                iRecyclableWidget.resetInternal();
                mScrapHeap.add(iRecyclableWidget);
            }
        }
    }

    static {
        Covode.recordClassIndex(20437);
    }

    public static final LiveWidgetProvider getInstance() {
        return Companion.getInstance();
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(20438);
        }

        public static /* synthetic */ void instance$annotations() {
        }

        private Companion() {
        }

        public final LiveWidgetProvider getInstance() {
            MethodCollector.m26663i(1671);
            if (LiveWidgetProvider.sInstance == null) {
                synchronized (LiveWidgetProvider.class) {
                    try {
                        if (LiveWidgetProvider.sInstance == null) {
                            LiveWidgetProvider.sInstance = new LiveWidgetProvider(null);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1671);
                        throw th;
                    }
                }
            }
            LiveWidgetProvider liveWidgetProvider = LiveWidgetProvider.sInstance;
            if (liveWidgetProvider == null) {
                C89219l.m154707a();
            }
            MethodCollector.m26664o(1671);
            return liveWidgetProvider;
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final void clear() {
        this.mRecycledViewPool.clear();
    }

    private LiveWidgetProvider() {
        this.mRecycledViewPool = new RecycledLiveWidgetPool();
    }

    public /* synthetic */ LiveWidgetProvider(C89214g gVar) {
        this();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.sdk.widgets.LiveWidgetProvider$RecycledLiveWidgetPool */
    /* JADX WARN: Multi-variable type inference failed */
    public final void clearWidgetCache(Class<? extends LiveRecyclableWidget> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.mRecycledViewPool;
        if (!(cls instanceof Class)) {
            cls = null;
        }
        recycledLiveWidgetPool.clearWidgetCache(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget) {
        C89219l.m154719c(iRecyclableWidget, "");
        this.mRecycledViewPool.putRecycledView(iRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final <T extends IRecyclableWidget> T provide(Class<T> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.mRecycledViewPool;
        if (cls != null) {
            T t = (T) recycledLiveWidgetPool.getRecycledView(cls);
            if (t != null) {
                return t;
            }
            try {
                T newInstance = cls.newInstance();
                if (newInstance == null) {
                    C89219l.m154707a();
                }
                T t2 = newInstance;
                if (!(t2 instanceof IRecyclableWidget)) {
                    return null;
                }
                return t2;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new C89388w("null cannot be cast to non-null type");
        }
    }
}
