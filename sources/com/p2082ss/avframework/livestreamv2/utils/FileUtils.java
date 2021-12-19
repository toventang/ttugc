package com.p2082ss.avframework.livestreamv2.utils;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.utils.AVLog;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.utils.FileUtils */
public class FileUtils {
    static {
        Covode.recordClassIndex(100619);
    }

    /* renamed from: com.ss.avframework.livestreamv2.utils.FileUtils$File */
    public static class File {
        private FileOutputStream mFileOutputStream;
        private String mName;

        static {
            Covode.recordClassIndex(100620);
        }

        public String name() {
            return this.mName;
        }

        public void close() {
            try {
                this.mFileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void write(Buffer buffer) {
            if (buffer instanceof ByteBuffer) {
                write((ByteBuffer) buffer);
                return;
            }
            throw new AndroidRuntimeException("Unsupport");
        }

        public void write(ByteBuffer byteBuffer) {
            byteBuffer.position(0);
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.get(bArr);
            write(bArr);
        }

        public void write(byte[] bArr) {
            MethodCollector.m26663i(2869);
            try {
                this.mFileOutputStream.write(bArr);
                this.mFileOutputStream.flush();
                MethodCollector.m26664o(2869);
            } catch (IOException e) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(e.getMessage());
                MethodCollector.m26664o(2869);
                throw androidRuntimeException;
            }
        }

        public File(FileOutputStream fileOutputStream, String str) {
            AVLog.m147809w("Utils.File", "Open write file ".concat(String.valueOf(str)));
            this.mFileOutputStream = fileOutputStream;
            this.mName = str;
        }
    }

    public static File CreateWriteFile(String str) {
        MethodCollector.m26663i(2761);
        try {
            File file = new File(new FileOutputStream(new java.io.File(str)), str);
            MethodCollector.m26664o(2761);
            return file;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(e.getMessage());
            MethodCollector.m26664o(2761);
            throw androidRuntimeException;
        }
    }
}
