string[] array = new string[] { "hello", "2", "world", ":-)" };
Console.Write("[");
for (int i = 0; i < array.Length; i++)
{
    if (array[i].Length <= 3)
    {
        Console.Write("\"" + array[i] + "\", ");
         
    }
}
Console.Write("\b\b]");