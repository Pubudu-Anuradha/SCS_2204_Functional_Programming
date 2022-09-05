object Caesar extends App {

  def encrypt(str: String, key: Int): String = {
    String(
      str
        .toCharArray()
        .map(c => {
          c match {
            case x if (x.toInt >= 'A'.toInt && x.toInt <= 'Z'.toInt) =>
              (((x.toInt - 'A'.toInt + key) % 26) + 'A'.toInt).toChar;
            case y if (y.toInt >= 'a'.toInt && y.toInt <= 'z'.toInt) =>
              (((y.toInt - 'a'.toInt + key) % 26) + 'a'.toInt).toChar;
            case _ => c
          }
        })
    )
  }

  def decrypt(str: String, key: Int): String = {
    String(
      str
        .toCharArray()
        .map(c => {
          c match {
            case x if (x.toInt >= 'A'.toInt && x.toInt <= 'Z'.toInt) => {
              ((x.toInt - 'A'.toInt - key) % 26) match {
                case a if (a < 0) => ('Z'.toInt + 1 + a).toChar;
                case b            => ('A'.toInt + b).toChar;
              }
            }
            case y if (y.toInt >= 'a'.toInt && y.toInt <= 'z'.toInt) => {
              ((y.toInt - 'a'.toInt - key) % 26) match {
                case a if (a < 0) => ('z'.toInt + 1 + a).toChar;
                case b            => ('a'.toInt + b).toChar;
              }
            }
            case _ => c
          }
        })
    )
  }

  def cypher(
      str: String,
      key: Int,
      processor: (String, Int) => String
  ): String = processor(str, key);

  // For Demonstration
  print("Enter a text to encrypt : ");
  var line: String = scala.io.StdIn.readLine();
  print("Enter key to use for cypher : ");
  var key: Int = scala.io.StdIn.readInt();

  var encrypted = cypher(line, key, encrypt);

  printf(
    "The string \"%s\" encrypted with the key %d is : %s\n",
    line,
    key,
    encrypted
  );

  var decrypted = cypher(encrypted, key, decrypt);

  printf(
    "The string \"%s\" decrypted with the key %d is : %s\n",
    encrypted,
    key,
    decrypted
  );

}
