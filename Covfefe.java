// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

class Covfefe {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            // https://codegolf.stackexchange.com/a/123736
            String rootRegex="[a-z&&[^aeiouy]]";
            String base=args[i].replaceAll("(^" + rootRegex + "*[aeiouy]+" + rootRegex + ").*","$1");

            String fefe="pgtvkhjglmnbqrzdfwxs".charAt(
                "bcdfghjklmnpqrstvwxz".indexOf(
                    base.charAt(base.length()-1)
                )) + args[i].split(base)[1]
                .replaceAll(
                    "^" + rootRegex + "*([aeiouy]).*","$1"
                );

            System.out.println(base + fefe + fefe);
        }
    }
}