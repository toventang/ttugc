package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.Map;

public class ResourcesFlusher {
    private static Field sDrawableCacheField;
    private static boolean sDrawableCacheFieldFetched;
    private static Field sResourcesImplField;
    private static boolean sResourcesImplFieldFetched;
    private static Class sThemedResourceCacheClazz;
    private static boolean sThemedResourceCacheClazzFetched;
    private static Field sThemedResourceCache_mUnthemedEntriesField;
    private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    static {
        Covode.recordClassIndex(244);
    }

    /* renamed from: androidx_appcompat_app_ResourcesFlusher_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m632x8c4dced1(String str, String str2, Throwable th) {
        return 0;
    }

    private ResourcesFlusher() {
    }

    public static void flush(Resources resources) {
        if (Build.VERSION.SDK_INT < 28) {
            if (Build.VERSION.SDK_INT >= 24) {
                flushNougats(resources);
            } else if (Build.VERSION.SDK_INT >= 23) {
                flushMarshmallows(resources);
            } else if (Build.VERSION.SDK_INT >= 21) {
                flushLollipops(resources);
            }
        }
    }

    private static void flushLollipops(Resources resources) {
        if (!sDrawableCacheFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                m632x8c4dced1("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            sDrawableCacheFieldFetched = true;
        }
        Field field = sDrawableCacheField;
        if (field != null) {
            try {
                Map map = (Map) field.get(resources);
                if (map != null) {
                    map.clear();
                }
            } catch (IllegalAccessException e2) {
                m632x8c4dced1("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
    }

    private static void flushMarshmallows(Resources resources) {
        if (!sDrawableCacheFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                m632x8c4dced1("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            sDrawableCacheFieldFetched = true;
        }
        Field field = sDrawableCacheField;
        if (field != null) {
            try {
                Object obj = field.get(resources);
                if (obj != null) {
                    flushThemedResourcesCache(obj);
                }
            } catch (IllegalAccessException e2) {
                m632x8c4dced1("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
    }

    private static void flushNougats(Resources resources) {
        if (!sResourcesImplFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                sResourcesImplField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                m632x8c4dced1("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            sResourcesImplFieldFetched = true;
        }
        Field field = sResourcesImplField;
        if (field != null) {
            try {
                Object obj = field.get(resources);
                if (obj != null) {
                    if (!sDrawableCacheFieldFetched) {
                        try {
                            Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                            sDrawableCacheField = declaredField2;
                            declaredField2.setAccessible(true);
                        } catch (NoSuchFieldException e2) {
                            m632x8c4dced1("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e2);
                        }
                        sDrawableCacheFieldFetched = true;
                    }
                    Field field2 = sDrawableCacheField;
                    if (field2 != null) {
                        try {
                            Object obj2 = field2.get(obj);
                            if (obj2 != null) {
                                flushThemedResourcesCache(obj2);
                            }
                        } catch (IllegalAccessException e3) {
                            m632x8c4dced1("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e3);
                        }
                    }
                }
            } catch (IllegalAccessException e4) {
                m632x8c4dced1("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e4);
            }
        }
    }

    private static void flushThemedResourcesCache(Object obj) {
        if (!sThemedResourceCacheClazzFetched) {
            try {
                sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                m632x8c4dced1("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            sThemedResourceCacheClazzFetched = true;
        }
        Class cls = sThemedResourceCacheClazz;
        if (cls != null) {
            if (!sThemedResourceCache_mUnthemedEntriesFieldFetched) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    sThemedResourceCache_mUnthemedEntriesField = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    m632x8c4dced1("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
            }
            Field field = sThemedResourceCache_mUnthemedEntriesField;
            if (field != null) {
                try {
                    LongSparseArray longSparseArray = (LongSparseArray) field.get(obj);
                    if (longSparseArray != null) {
                        longSparseArray.clear();
                    }
                } catch (IllegalAccessException e3) {
                    m632x8c4dced1("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
            }
        }
    }
}
