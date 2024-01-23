package com.papijeiboi.exam_project.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TrackDao_Impl implements TrackDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TrackResult> __insertionAdapterOfTrackResult;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTrack;

  public TrackDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrackResult = new EntityInsertionAdapter<TrackResult>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `track` (`collectionId`,`trackName`,`primaryGenreName`,`trackPrice`,`longDescription`,`artworkUrl100`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrackResult value) {
        stmt.bindLong(1, value.getCollectionId());
        if (value.getTrackName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTrackName());
        }
        if (value.getPrimaryGenreName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPrimaryGenreName());
        }
        if (value.getTrackPrice() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getTrackPrice());
        }
        if (value.getLongDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLongDescription());
        }
        if (value.getArtworkUrl100() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getArtworkUrl100());
        }
      }
    };
    this.__preparedStmtOfDeleteAllTrack = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM track";
        return _query;
      }
    };
  }

  @Override
  public Object insertTrack(final List<TrackResult> person,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTrackResult.insert(person);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllTrack(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTrack.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllTrack.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<TrackResult>> getAllTrack() {
    final String _sql = "SELECT * FROM track";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"track"}, new Callable<List<TrackResult>>() {
      @Override
      public List<TrackResult> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCollectionId = CursorUtil.getColumnIndexOrThrow(_cursor, "collectionId");
          final int _cursorIndexOfTrackName = CursorUtil.getColumnIndexOrThrow(_cursor, "trackName");
          final int _cursorIndexOfPrimaryGenreName = CursorUtil.getColumnIndexOrThrow(_cursor, "primaryGenreName");
          final int _cursorIndexOfTrackPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "trackPrice");
          final int _cursorIndexOfLongDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "longDescription");
          final int _cursorIndexOfArtworkUrl100 = CursorUtil.getColumnIndexOrThrow(_cursor, "artworkUrl100");
          final List<TrackResult> _result = new ArrayList<TrackResult>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrackResult _item;
            final int _tmpCollectionId;
            _tmpCollectionId = _cursor.getInt(_cursorIndexOfCollectionId);
            final String _tmpTrackName;
            if (_cursor.isNull(_cursorIndexOfTrackName)) {
              _tmpTrackName = null;
            } else {
              _tmpTrackName = _cursor.getString(_cursorIndexOfTrackName);
            }
            final String _tmpPrimaryGenreName;
            if (_cursor.isNull(_cursorIndexOfPrimaryGenreName)) {
              _tmpPrimaryGenreName = null;
            } else {
              _tmpPrimaryGenreName = _cursor.getString(_cursorIndexOfPrimaryGenreName);
            }
            final Double _tmpTrackPrice;
            if (_cursor.isNull(_cursorIndexOfTrackPrice)) {
              _tmpTrackPrice = null;
            } else {
              _tmpTrackPrice = _cursor.getDouble(_cursorIndexOfTrackPrice);
            }
            final String _tmpLongDescription;
            if (_cursor.isNull(_cursorIndexOfLongDescription)) {
              _tmpLongDescription = null;
            } else {
              _tmpLongDescription = _cursor.getString(_cursorIndexOfLongDescription);
            }
            final String _tmpArtworkUrl100;
            if (_cursor.isNull(_cursorIndexOfArtworkUrl100)) {
              _tmpArtworkUrl100 = null;
            } else {
              _tmpArtworkUrl100 = _cursor.getString(_cursorIndexOfArtworkUrl100);
            }
            _item = new TrackResult(_tmpCollectionId,_tmpTrackName,_tmpPrimaryGenreName,_tmpTrackPrice,_tmpLongDescription,_tmpArtworkUrl100);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
