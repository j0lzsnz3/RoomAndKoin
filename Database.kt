@Database(entities = [PendaftaranDetailData::class], version = 1)
abstract class PendaftaranDatabase : RoomDatabase() {

    abstract fun pendaftaranDao() : PendaftaranDao

}